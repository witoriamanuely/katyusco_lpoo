public class Funcionario {
    public static String nome;
    public static String departamento;
    public static double salario;
    public static int dataEntrada;
    public static String rg;
    public static boolean estaNaEmpresa;

    public static double aumentaSalario(double aumento){
        salario = salario + aumento;
        return salario;
    }
    public static double salarioAnual(){
        salario = salario*12;
        return salario;
    }
    public static void mostra(){
        System.out.printf("Nome: %s\nDepartamento: %s\nSalario Atual: %.2f\n" +
                "Data de entrada: %d\nRG: %s\n", nome, departamento, salario, dataEntrada, rg);
        System.out.println("Salario Anual:"+salarioAnual());
    }
}
