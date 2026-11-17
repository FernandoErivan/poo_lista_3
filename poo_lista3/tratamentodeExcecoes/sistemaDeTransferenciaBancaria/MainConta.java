package tratamentodeExcecoes.sistemaDeTransferenciaBancaria;

public class MainConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta(101, 1000.00);
        Conta conta2 = new Conta(102, 500.00);

        try {
            System.out.println("=== TRANSFERÊNCIA VÁLIDA ===");

            conta1.transferir(conta2, 300.00);

            conta1.exibirSaldo();
            conta2.exibirSaldo();

            System.out.println("\n=== TRANSFERÊNCIA INVÁLIDA ===");

            conta1.transferir(conta2, 2000.00);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
