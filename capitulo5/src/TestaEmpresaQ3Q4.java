public class TestaEmpresaQ3Q4 {
    public static void main(String[] args){
        Empresa empresa = new Empresa();
        for (int i = 0; i < 10; i++) {
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            empresa.adiciona(f);
        }
        empresa.mostraEmpregados();
    }
}
