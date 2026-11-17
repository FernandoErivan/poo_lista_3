package questaoIntegradora.sistemaDePedidos;

public class ProdutoDigital extends Produto implements IDescontavel {
    
    public ProdutoDigital(String nome, double precoBase) throws PrecoInvalidoException{

        super(nome, precoBase);
    }

    @Override 
    public double calcularPrecoFinal(){
        return precoBase;
    }

    @Override 
    public double aplicarDesconto(double percentual){
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException(
                "Percentual de desconto inválido."
            );
        }

        return calcularPrecoFinal() -
            (calcularPrecoFinal() * percentual / 100);
    }
}
