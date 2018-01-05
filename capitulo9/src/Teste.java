public class Teste {
    public static void main(String[] args){
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.deposita(1000);
        cp.deposita(1000);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        cc.mostra();
        cp.mostra();
    }
}
