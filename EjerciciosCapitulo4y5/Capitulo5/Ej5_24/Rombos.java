import java.util.Scanner;

public class Rombos
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            for(int k=n-i; k>0; k--){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for(int i=0; i<=n; i++){
            for(int k=0; k<=i; k++){
                System.out.print(" ");
            }
            for(int k=n-i-1; k>0; k--){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }   
}
