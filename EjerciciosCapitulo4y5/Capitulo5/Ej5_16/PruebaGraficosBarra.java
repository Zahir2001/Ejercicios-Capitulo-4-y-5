import java.util.Scanner;

public class PruebaGraficosBarra
{
    public static void main(String[] args)
    {
        GraficosBarra barra = new GraficosBarra();
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int numAste = 0;

        do {
            System.out.print("Ingrese el primer numero: ");
            numAste = sc.nextInt();

            if (numAste > 0 && numAste < 30) {
                barra.imprimir(numAste);
                contador++;
            } else {
                System.out.println("Ingrese un numero entre 1 y 30");
            }
        } while (contador <= 5);
    }   
}
