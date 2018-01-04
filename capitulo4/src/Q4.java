public class Q4 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        f1.nome = "Hugo";
        f1.salario = 100;
        f2.nome = "Hugo";
        f2.salario = 100;

        if(f1 == f2){
            System.out.printf("Objetos iguais!");
        }else{
            System.out.printf("Objetos diferentes!");
        }

    }
}
