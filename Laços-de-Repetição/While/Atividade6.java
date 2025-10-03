import java.util.Scanner;

public class exseis {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int numero;
     int cont = 0;

    
        System.out.println("Informe um numero: ");
        numero = sc.nextInt();
    
      
      
        while(numero%2==0){
            if(cont<=numero){
           cont++;
           numero=numero-cont;
           
            System.out.println(numero+",");
           
            }
            else{
                System.out.println("Numero negativo");
            }

        }sc.close();
    } 
    }
      
    

       

     



    


