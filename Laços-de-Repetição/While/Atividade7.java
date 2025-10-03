import java.util.Scanner;

public class exsete {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero=0;
            int n=0;
            int maior=0;
            
            
            

            while(n==0){
                
            
             System.out.println("Informe o número:");
             numero=sc.nextInt();
             if(numero>maior){
                maior=numero;

             }
             
             
             System.out.println("Deseja sair (1- sair 0-continuar):");
             n= sc.nextInt();

         
            }
     System.out.println("O maior numero digitado é"+maior);
            

        }
}

