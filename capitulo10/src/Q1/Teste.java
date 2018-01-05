public class Teste {
    public static void main(String[] args){
        Quadrado q = new Quadrado(4);
        Retangulo r = new Retangulo(5,4);
        Circulo c = new Circulo(2);


        System.out.printf("Area de quadrado: %.2fm²\nArea do retangulo: %.2fm²\nArea do circulo: %.2fm²",+
                q.calculaArea(),r.calculaArea(),c.calculaArea());
    }
}
