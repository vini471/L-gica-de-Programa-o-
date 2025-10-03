import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int contador = 0; contador <= 50; contador ++) {
           if ((contador %2) == 0){
            System.out.println(contador); 
           }
    }
    sc.close();  
    }
}
