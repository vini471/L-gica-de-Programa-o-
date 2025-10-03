import java.util.Scanner;

public class exum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int idade;
    int soma =0, cont=0;

do{

    System.out.println("Informe a idade: ");
    idade=sc.nextInt();

    if(idade>0){

        soma=soma+idade;
        cont++;
    }
    else{
        System.out.println("Usuario digitou -1");
    }
}while(idade !=-1);


    System.out.println("A média de idade é: "+soma+cont);


sc.close();


}
}










