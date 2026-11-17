package tratamentodeExcecoes.excecoesPersonalizadas;

public class Livro  {
    
    private String titulo;
    private int exemplaresDisponiveis;

    public Livro(String titulo, int exemplaresDisponiveis){
        this.titulo = titulo;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public void emprestar() throws LivroIndisponivelException{
        if (exemplaresDisponiveis <= 0) {
            throw new LivroIndisponivelException("Não existem exemplares disponíveis");
        }

        exemplaresDisponiveis--;

        System.out.println("Livro emprestado com sucesso!");
        System.out.println("Exemplares restantes: " + exemplaresDisponiveis);
    }
}
