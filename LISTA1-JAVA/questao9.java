import java.util.Scanner;
public class questao9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num[] = new int[2];
        int i, quantPar = 0;
        int quantImpar= 0;
        int soma = 0;
        for (i = 0; i < ; i++){
            System.out.printf("Informe o %dº numero:", (i+1));
            num[i] = input.nextInt();
            if (num[i] % 2 == 0){
                quantPar++;
            }else{
                quantImpar++;
            }
            soma += num[i];
        }
        System.out.printf("Quantidade Impar: %d\n", quantImpar);
        System.out.printf("Quantidade Par: %d\n", quantPar);
        System.out.printf("Soma: %d\n", soma);
    }
}