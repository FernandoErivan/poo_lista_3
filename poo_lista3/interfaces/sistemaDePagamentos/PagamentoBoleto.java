package interfaces.sistemaDePagamentos;

public class PagamentoBoleto implements IPagamento {
    
    @Override 
    public void processarPagamento(double valor){
        System.out.println("Pagamento realizado via Boleto");
        System.out.printf("Valor: R$ %.2f%n", valor);
    }
}
