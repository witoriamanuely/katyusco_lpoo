import java.util.Scanner;
public class questao10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float numero;
        int cont = 0;
        System.out.printf("Informe um numero: ");
        numero = input.nextFloat();
        while(true){
            numero/=2;
            cont ++;
            if (numero < 1){
                break;
            }   
        }
        System.out.printf("Resultado final: %.2f\nQuantidade de divisões efetuadas: %d\n", numero, cont);

    }
} 