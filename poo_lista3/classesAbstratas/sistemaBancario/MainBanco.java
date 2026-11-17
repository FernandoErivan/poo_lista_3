public class MainBanco {
     public static void main(String[] args) {

        // Criando as contas
        ContaCorrente corrente =
            new ContaCorrente("João", 1000.00);

        ContaPoupanca poupanca =
            new ContaPoupanca("Maria", 1500.00);

        // Operações na conta corrente
        System.out.println("=== CONTA CORRENTE ===");

        corrente.depositar(200.00);
        corrente.sacar(100.00);
        corrente.exibirSaldo();

        // Operações na conta poupança
        System.out.println("\n=== CONTA POUPANÇA ===");

        poupanca.depositar(300.00);
        poupanca.sacar(100.00);
        poupanca.exibirSaldo();
    }
}
