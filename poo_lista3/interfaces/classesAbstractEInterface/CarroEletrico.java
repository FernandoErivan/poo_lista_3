package interfaces.classesAbstractEInterface;

public class CarroEletrico extends Veiculo implements IEletrico {
    
    public CarroEletrico(String modelo, double velocidadeAtual){
        super(modelo, velocidadeAtual);
    }

    @Override 
    public void acelerar(){
        velocidadeAtual += 15;
        System.out.println("Carro elétrico acelerando...");
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    @Override 
    public void carregarBateria(){
        System.out.println("Bateria está sendo carregada!");
    }
}
