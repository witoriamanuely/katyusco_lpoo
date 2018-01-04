import java.util.Scanner;
public class questao1{
    public static void main(String[] args){
        double valor, conversao;
        Scanner input = new Scanner (System.in);
        System.out.printf("Informe um valor em m/s a ser convertido:");
        valor = input.nextDouble();
        conversao = valor*3.6;
        System.out.printf("Valor em Km/h: %.2f \n", conversao);
    }
}