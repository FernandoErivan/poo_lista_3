package tratamentodeExcecoes.cadastroDeProdutos;

public class MainProdutos {
    public static void main(String[] args) {
         try {
            Produto p1 = new Produto("Notebook", 3500.00, 5);
            p1.exibirProduto();

            System.out.println();

            Produto p2 = new Produto("Mouse", 50.00, 10);
            p2.exibirProduto();

            System.out.println();

            Produto p3 = new Produto("Teclado", -20.00, 3);
            p3.exibirProduto();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }
}
