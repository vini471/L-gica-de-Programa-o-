import java.util.Scanner;

public class extres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero= 0, cont=0;

        System.out.print("Informe um número: ");
            numero=sc.nextInt();
        do{
          
            System.out.print(cont +", ");
            cont++;
        }
        while(cont<=numero);

        sc.close();
    }
}
