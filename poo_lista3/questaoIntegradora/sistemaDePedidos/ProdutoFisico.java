package questaoIntegradora.sistemaDePedidos;

public class ProdutoFisico extends Produto{
    
    public ProdutoFisico(String nome, double percentual) throws PrecoInvalidoException{
        super(nome, percentual);
    }

    @Override 
    public double calcularPrecoFinal(){
        return precoBase + 15.00;
    }
}
