package interfaces.sistemaDeDispositivosEletronicos;

public class Computador implements ILigavel, IConectavel {
    
    @Override 
    public void ligar(){
        System.out.println("Computador ligou!");
    }

    @Override 
    public void desligar(){
        System.out.println("Computador desligou!");
    }

    @Override 
    public void conectarInternet(){
        System.out.println("Computador está conectado à internet!");
    }
}
