import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

       double total = 0;
       

        for(int vlr = 0; vlr < 5; vlr++){
            System.out.println("Informe um valor: ");
            int num = sc.nextInt();

            total = total + num;

        } System.out.println(total);
        sc.close();
    } 
}
