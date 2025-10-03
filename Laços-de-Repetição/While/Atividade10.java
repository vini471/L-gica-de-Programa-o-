import java.util.Scanner;

public class exdez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, i = 0;

        System.out.print("Digite um número positivo: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Digite um número positivo.");
        } else {
            while (i <= numero) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        scanner.close();
    }
}
