import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double med = 0;

        for(double nota = 0; nota < 4; nota++){
            System.out.println("Informe sua nota");
             double vlr = sc.nextInt();

             med = (med + vlr);

        } double tt = med / 4;
         System.out.println("Sua media foi : "+ tt);
         sc.close();
    }
}
