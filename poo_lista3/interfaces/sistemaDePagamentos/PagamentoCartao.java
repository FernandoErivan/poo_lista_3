package interfaces.sistemaDePagamentos;

public class PagamentoCartao implements IPagamento {
    
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento realizado via Cartão");
        System.out.printf("Valor: R$ %.2f%n", valor);
    }
}
