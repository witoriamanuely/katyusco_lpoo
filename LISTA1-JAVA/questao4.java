import java.util.Scanner;
public class questao4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double nota1, soma = 0, media;
        int i;
        for(i = 0; i < 4; i++){
            System.out.printf("Informe a nota da %dª prova:", (i+1));
            nota1 = input.nextDouble();
            soma+=nota1;
        }
        media = soma/4;
        if (media < 5.0){
            System.out.printf("Reprovado\n");
        }else if (media > 5.0 && media < 7.0){
            System.out.printf("Final\n");
        }else{
            System.out.printf("Aprovado\n");
        }
    }
} 