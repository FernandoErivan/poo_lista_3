package interfaces.sistemaDePagamentos;

public class PagamentoPix implements IPagamento{
    
    @Override 
    public void processarPagamento(double valor){
        System.out.println("Pagamento realizado via Pix");
        System.out.printf("Valor: R$ %.2f%n", valor);
    }
}
