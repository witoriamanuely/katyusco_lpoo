import java.util.Scanner;
public class questao11{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int quantidade, i, codigo;
        float total = 0F;
        String escolha;
        System.out.print("----------------Menu-----------------\n");
        System.out.print("Código\tProduto\t\t\tPreço\n10\tPastel de carne\t\t1,50\n11\tCoxinha de frango\t1,80\n12\tEmpada de frango\t1,90\n20\tHamburguer\t\t10,00\n30\tPizza\t\t\t8,00\n50\tSuco\t\t\t2,50\n\n");
        while (true){
            System.out.printf("Informe o codigo do produto:");
            codigo = input.nextInt();
            System.out.printf("Informe a quantidade do produto:");
            quantidade = input.nextInt();
            switch (codigo){
                case 10:
                    total += (1.5F*quantidade);
                    break;
                case 11:
                    total += (1.8F*quantidade);
                    break;
                case 12:
                    total += (1.9F*quantidade);
                    break;
                case 20:
                    total += (10.0F*quantidade);
                    break;
                case 30:
                    total += (8.0F*quantidade);
                    break;
                case 50:
                    total += (2.5F*quantidade);
                    break;
                default:
                    System.out.println("Código invalido");
                    break;
            }
            System.out.printf("Mais alguma coisa? S/N:");
            escolha = input.next();
            if(escolha.equals("N")){
                 break;
            }
            
        }
        if(total > 50.0){
            total *= 0.95;
        }
        System.out.printf("O total a pagar é de: R$%.2f\n", total);
    }
}