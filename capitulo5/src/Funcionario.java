public class Funcionario {
    public String nome;
    public String departamento;
    public double salario;
    public int dataEntrada;
    public  String rg;
    public boolean estaNaEmpresa;

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
                "Data de entrada: %d\nRG: %s\n", nome, departamento, salario, dataEntrada, rg);
        System.out.println("Salario Anual:"+salarioAnual());
    }
}
