import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] notas = new double [3];
        double nota, total = 0, media = 0.0;

        for(int contador = 0; contador < 3; contador++) {
            System.out.println("Informe as temperaturas: ");
            nota = sc.nextDouble();

            notas[contador] = nota;
        }
        for(int contador =0; contador < 3; contador++){
            total = total + notas[contador];
        }
        media = total /3;
        System.out.println("A media de temperatura foi de: "+media);
        System.out.println("Deseja continuar s/n: ");
        char resposta = sc.next().toUpperCase().charAt(0);


        do{
            nota = 0;
            media = 0;
            total = 0;
            for(int contador = 0; contador < 3; contador++) {
                System.out.println("Informe as temperaturas: ");
                nota = sc.nextDouble();
    
                notas[contador] = nota;
            }
            for(int contador =0; contador < 3; contador++){
                total += notas[contador];
            }
            media = total /3;
            
            System.out.println("A media de temperatura foi de: "+media);
            System.out.println("Deseja continuar s/n: ");
            resposta = sc.next().toUpperCase().charAt(0);

         if(resposta == 'N'){
            System.out.println("Programa encerrado");

    }
}while(resposta == 'S');
    
    }
}
