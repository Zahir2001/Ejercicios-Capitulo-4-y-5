import java.security.Principal;
import java.util.Scanner;

public class PruebaRegistroConsumo {   
    
    public static void main(String[] args){

        PrincipalRegistro principal = new PrincipalRegistro();
        
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while(opcion!=0){
            System.out.println("1. Ingresar Registro: ");
            System.out.println("2. Mostrar la informacion del recorrido del auto: ");
            System.out.println("3. Calcular promedio de kilometro por litro: ");
            System.out.println();
            System.out.println("Escoja una opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                     principal.realizarRegistro();
                break;
                
                case 2:
                    principal.mostrarInformacionG();
                break;
                
                case 3:
                    System.out.println("Kilometros por litros: " +principal.calcularPromedio());
                break;
            }
        }
    }

}
