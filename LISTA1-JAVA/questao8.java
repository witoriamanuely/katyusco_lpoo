import java.util.Scanner;
public class questao8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, media,soma = 0; 
        int menor = 1000000000;
        int maior = 0;
        int num[] = new int[10];
        for (i = 0; i < 10; i++){
            System.out.printf("Informe o %dº numero:", (i+1));
            num[i] = input.nextInt();
            soma += num[i];
            if (num[i] > maior){
                maior = num[i];
            }
            if (num[i] < menor)
                menor = num[i];
        }
        media = soma/10;
        System.out.printf("Media: %d\n", media);
        System.out.printf("Maior Numero: %d\n", maior);
        System.out.printf("Menor Numero: %d\n", menor);

        }
}