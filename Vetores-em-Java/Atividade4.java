import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] nota = new double [9];
        String [] nomes = new String[3];
        double[] media = new double[3];
        int cont = 0;
        double soma =0;

        for(int nt = 0; nt < 3; nt++){  
            System.out.println("Informe seu nome: ");            
            nomes[nt]=sc.nextLine();

            for(int i = 0; i<3; i++){
                System.out.println((i + 1)+" º nota");
                nota[cont] = sc.nextDouble();
                soma = soma + nota[cont];
                cont++;

            }
            sc.nextLine();
            media[nt] = soma/3;
            soma = 0;
        }
          for(int i =0 ; i< 3; i++ ){
            if(media[i]>= 7.0){

                System.out.println("O aluno: "+nomes[i]+ " teve a média: "+media[i]+ "está aprovado");
            }

          }
          
            
           
            

        }
    }

