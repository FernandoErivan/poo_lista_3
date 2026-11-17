package interfaces.classesAbstractEInterface;

public class Carro extends Veiculo {
    
    public Carro(String modelo, double velocidadeAtual){
        super(modelo, velocidadeAtual);
    }

    @Override 
    public void acelerar(){
        velocidadeAtual += 10;
        System.out.println("Carro acelerrando...");
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual + "km/h");
    }
}
