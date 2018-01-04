import java.util.Scanner;
public class questao5{
    public static void main(String[] args){
        int mes = 0;
        Scanner input = new Scanner(System.in);
        String mesPalavra;
        System.out.printf("Informe o numero correspondente ao mês:");
        mes = input.nextInt();
        switch (mes){  
            case 1: 
                System.out.printf("Janeiro\n"); 
                break;
            case 2: 
                System.out.printf("Fevereiro\n"); 
                break;
            case 3: 
                System.out.printf("Março\n"); 
                break;
            case 4: 
                System.out.printf("Abril\n"); 
                break;
            case 5: 
                System.out.printf("Maio\n"); 
                break;
            case 6: 
                System.out.printf("Junho\n"); 
                break;
            case 7: 
                System.out.printf("Julho\n"); 
                break;
            case 8: 
                System.out.printf("Agosto\n"); 
                break;
            case 9: 
                System.out.printf("Setembro\n"); 
                break;
            case 10: 
                System.out.printf("Outubro\n"); 
                break;
            case 11: 
                System.out.printf("Novembro\n"); 
                break;
            case 12: 
                System.out.printf("Dezembro\n"); 
                break;
            default: 
                System.out.printf("Inválido\n"); 
                break;
        }
    }
        
    
}