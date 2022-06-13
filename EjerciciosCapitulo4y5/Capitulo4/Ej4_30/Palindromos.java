import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String entero;
        char [] palindromo;
        int izquierda, derecha;
        System.out.println("Ingrese el entero: ");
        entero = sc.nextLine();
        entero = entero.toLowerCase();
        entero = entero.replace(" ","");
        palindromo = entero.toCharArray();
        izquierda = 0;
        derecha = palindromo.length - 1 ;
        
        
        while(izquierda < derecha){
            if(palindromo[izquierda] == palindromo[derecha]){
                derecha --;
                izquierda++;
            }else{
                System.out.println("El entero no es un palindromo.");
                break;
            }
        }
        
        if (izquierda == derecha){
            System.out.println("El entero es un palindromo.");
        }
     }
}

