public class MainFuncionario {
    public static void main(String[] args) {

        FuncionarioCLT funcionario1 = new FuncionarioCLT("João", 3000.00);

        FuncionarioPJ funcionario2 = new FuncionarioPJ("Maria", 5000.00);

        System.out.println("=== FUNCIONÁRIO CLT ===");
        System.out.println("Nome: João");
        System.out.printf("Salário final: R$ %.2f%n",
                funcionario1.calcularSalario());

        System.out.println("\n=== FUNCIONÁRIO PJ ===");
        System.out.println("Nome: Maria");
        System.out.printf("Salário final: R$ %.2f%n",
                funcionario2.calcularSalario());
    }
}
