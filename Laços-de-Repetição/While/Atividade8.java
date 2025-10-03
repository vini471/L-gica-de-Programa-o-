import java.util.Scanner;

public class exoito {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int senha=0;
        int verifica=0;
         
        System.out.println("Digite sua senha: ");
        senha= sc.nextInt();

        while(verifica!=senha)
        {
         System.out.println("Informe sua senha novamete");
         verifica= sc.nextInt();
        
         
        }
        if(verifica==senha)

        {
            System.out.println("Senha correta");
         }
        sc.close();
    }
}
