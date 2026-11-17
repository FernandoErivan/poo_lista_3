package questaoIntegradora.sistemaDePedidos;

public class PrecoInvalidoException extends Exception {
    
    public PrecoInvalidoException(String mensagem){
        super(mensagem);
    }
}
