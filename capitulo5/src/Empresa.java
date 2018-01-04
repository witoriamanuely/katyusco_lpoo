public class Empresa {
    public Funcionario [] empregados;
    public String CNPJ;
    public int cont = 0;


    public void adiciona(Funcionario empregado){
        empregados = new Funcionario[10];
        if (cont == empregados.length){
            System.out.println("Sem espaço!");
        }else{
            empregados[cont] = empregado;
            cont++;
        }
    }
    public void mostraEmpregados() {
        for (int i = 0; i < cont; i++) {
            System.out.println("Funcionário na posição: " + i);
            empregados[i].mostra();
        }
    }
}
