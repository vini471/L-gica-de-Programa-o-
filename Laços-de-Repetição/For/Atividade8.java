import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomes;

        for(int contador = 0; contador < 5; contador++){
            System.out.println("Informe o nome das pessoas: ");
            nomes = sc.nextLine();

            System.out.println("Bem Vindo! "+nomes);

        }
    }
}
