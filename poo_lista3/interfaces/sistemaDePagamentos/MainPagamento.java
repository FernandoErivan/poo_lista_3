package interfaces.sistemaDePagamentos;

public class MainPagamento {
     public static void main(String[] args) {

        IPagamento[] pagamentos = new IPagamento[3];

        pagamentos[0] = new PagamentoPix();
        pagamentos[1] = new PagamentoCartao();
        pagamentos[2] = new PagamentoBoleto();

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(100.00);
            System.out.println();
        }
    }
}
