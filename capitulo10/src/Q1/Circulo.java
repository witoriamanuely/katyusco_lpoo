public class Circulo implements AreaCalculavel {
    private double raio;
    private double PI = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return ((raio*raio)*PI);
    }
}
