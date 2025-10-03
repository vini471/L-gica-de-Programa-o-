import java.util.Scanner;

public class excinco {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String palavra, palavrainvertida= "";
        int i;

        System.out.println("Digite uma palavra: ");
        palavra= sc.nextLine();

        i=palavra.length() -1;

        do{
            palavrainvertida = palavrainvertida + palavra.charAt(i);
            i--;
        }while(i>=0);
        System.out.println("Palavra Invertida: "+palavrainvertida);
        sc.close();


    
    }
}
