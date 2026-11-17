package tratamentodeExcecoes.excecoesPersonalizadas;

public class MainLivros {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", 2);

        for (int i = 1; i <= 3; i++) {

            System.out.println("\nEmpréstimo " + i);

            try {
                livro.emprestar();

            } catch (LivroIndisponivelException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
