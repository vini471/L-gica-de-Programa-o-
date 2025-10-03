import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vasco = new int [3];
        int [] inter = new int [3];
        int [] torneio = new int [3];
        

       for(int vas = 0;  vas < 3; vas ++){
        System.out.println((vas + 1)+" jogo");
        System.out.println("Informe quantos gols o vasco marcou: ");
         int gols_vasco = sc.nextInt();
       vasco[vas] += gols_vasco;

       System.out.println("informe quantos gols o inter marcou: ");
       int gols_inter = sc.nextInt();
       inter[vas] += gols_inter; 
       }
       for(int id = 0; id < 3; id ++){
        torneio[id] = vasco[id] + inter[id];

        System.out.println("Soma de gols do" + (id+1) + "º jogo é: "+ torneio[id]);
       }
    }
}
