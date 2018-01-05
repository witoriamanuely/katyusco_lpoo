package Q2;

public class ContaCorrente extends Conta implements Tributavel {

    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
    public void deposita(double valor) {

        this.saldo += valor - 0.10;
    }
}
