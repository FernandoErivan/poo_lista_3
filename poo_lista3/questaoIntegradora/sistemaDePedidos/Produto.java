package questaoIntegradora.sistemaDePedidos;

public abstract class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase)
            throws PrecoInvalidoException {

        if (precoBase <= 0) {
            throw new PrecoInvalidoException(
                "O preço deve ser maior que zero."
            );
        }

        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();
}
