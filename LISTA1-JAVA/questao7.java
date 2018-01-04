import java.util.Scanner;
public class questao7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double nota; 
        System.out.printf("Informe sua nota:");
        nota = input.nextDouble();
        if (nota >= 0 && nota <= 49){
            System.out.printf("Insuficiente\n");
        }else if (nota >= 50 && nota <= 64){
            System.out.printf("Regular\n");
        }else if (nota >= 65 && nota <= 84){
            System.out.printf("Bom\n");
        }else if (nota >= 85 && nota <= 100){
            System.out.printf("Ótimo\n");
        }else{
            System.out.printf("Nota inválida\n");
        }
    }
}