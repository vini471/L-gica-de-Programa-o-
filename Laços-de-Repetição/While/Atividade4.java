import java.util.Scanner;

public class exquatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,soma =0;

        do{

            System.out.println("Informe um numero: ");
            numero=sc.nextInt();

            if(numero>0){
                soma=soma+numero;

            }
            else if(numero==0)
            {
                System.out.println("Usuario digitou 0, \nsair!");

            }
        }while(numero !=0);
        System.out.println("Total da soma é: "+soma);
        sc.close();
            




        

    }
}
