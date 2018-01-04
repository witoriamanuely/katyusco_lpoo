import java.util.Scanner;
public class questao6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dias;
        String nome;
        System.out.printf("Informe o nome do cliente:");
        nome = input.next();
        System.out.printf("Informe a quantidade de dias hospedado:");
        dias = input.nextInt();
        double diaria = 60.0, total;
        System.out.printf("Nome do cliente: %s\n",nome);
        if (dias > 15){
            total = diaria + (5.50*dias);
            System.out.printf("Total a pagar:%.2f\n", total);
        }else if(dias == 15){
            total = diaria + (6.0*dias);
            System.out.printf("Total a pagar:%.2f\n", total);
        }else{
            total = diaria + (8.0*dias);
            System.out.printf("Total a pagar:%.2f\n", total);
        }
        


    }
}