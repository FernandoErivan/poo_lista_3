package interfaces.classesAbstractEInterface;

public class MainVeiculos {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Gol", 20);

        CarroEletrico eletrico =
            new CarroEletrico("Tesla", 30);

        System.out.println("=== CARRO COMUM ===");
        carro.acelerar();

        System.out.println("\n=== CARRO ELÉTRICO ===");
        eletrico.acelerar();
        eletrico.carregarBateria();
    }
}
