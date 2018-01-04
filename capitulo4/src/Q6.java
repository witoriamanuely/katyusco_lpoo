// opcional
public class Q6 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Data data = new Data();
        data.dia = 27;
        data.mes = 10;
        data.ano = 2017;
        f1.dataEntrada = data;
        f1.mostra();
    }
}
