import java.util.Scanner;
public class questao12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numeros[] = {0,1,2,3,4,5,6,7,8,9,10};
        int numerosQuadrado[] = new int[11];
        int numerosCubo[] = new int[11];
        int i;
        System.out.printf("Numero\tQuadrado\tCubo\n");
        for(i = 0; i <= 10; i++){
            numerosQuadrado[i] = numeros[i]*numeros[i];
            numerosCubo[i] = numeros[i]*numeros[i]*numeros[i];
            System.out.printf("%d\t%d\t\t%d\n",numeros[i],numerosQuadrado[i],numerosCubo[i]);
        
        }

    }
}