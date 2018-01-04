public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private int dataEntrada;
    private  String rg;
    private boolean estaNaEmpresa;

    public Funcionario() {
        this.nome = nome;
    }
    //public Funcionario(String nome) {
      //  this.nome = nome;
    //}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(int dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public double aumentaSalario(double aumento){
        salario = salario + aumento;
        return salario;
    }
    public double salarioAnual(){
        salario = salario*12;
        return salario;
    }
    public void mostra(){
        System.out.printf("Nome: %s\nDepartamento: %s\nSalario Atual: %.2f\n" +
                "Data de entrada: %d\nRG: %s\n", getNome(), getDepartamento(), getSalario(), getDataEntrada(), getRg());
        System.out.println("Salario Anual:"+salarioAnual());
    }
}
