package questaoIntegradora.sistemaDePedidos;

public class MainIntegradora {
    public static void main(String[] args) {
          try {

            ProdutoFisico fisico =
                new ProdutoFisico("Notebook", 3000.00);

            ProdutoDigital digital =
                new ProdutoDigital("Curso Java", 200.00);

            Produto[] produtos = new Produto[2];

            produtos[0] = fisico;
            produtos[1] = digital;

            System.out.println("=== LISTA DE PRODUTOS ===");

            for (int i = 0; i < produtos.length; i++) {

                System.out.println("Produto: " + produtos[i].nome);

                System.out.printf("Preço final: R$ %.2f%n",
                    produtos[i].calcularPrecoFinal());

                System.out.println();
            }

            System.out.println("=== DESCONTO NO PRODUTO DIGITAL ===");

            double valorComDesconto =
                digital.aplicarDesconto(10);

            System.out.printf(
                "Preço com 10%% de desconto: R$ %.2f%n",
                valorComDesconto
            );

            System.out.println("\n=== TESTE DE EXCEÇÃO ===");

            ProdutoFisico produtoInvalido = new ProdutoFisico("Teclado", -50.00);

        } catch (PrecoInvalidoException e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }
}
