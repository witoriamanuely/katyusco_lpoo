package Q2;
public class Teste {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        System.out.println(cc.calculaTributos());

    }
}
