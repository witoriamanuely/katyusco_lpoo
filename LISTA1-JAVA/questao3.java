import java.util.Scanner;
public class questao3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        System.out.printf("Informe a nota da 1ª prova:");
        nota1 = input.nextDouble();
        System.out.printf("Informe a nota da 2ª prova:");
        nota2 = input.nextDouble();
        System.out.printf("Informe a nota da 3ª prova:");
        nota3 = input.nextDouble();
        media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
        System.out.printf("Media final: %.2f\n", media);
    }
}