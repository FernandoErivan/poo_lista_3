package interfaces.sistemaDeDispositivosEletronicos;

public class MainDispositivos {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        Roteador roteador = new Roteador();
        Computador computador = new Computador();

        System.out.println("=== TELEVISÃO ===");
        tv.ligar();
        tv.desligar();

        System.out.println("\n=== ROTEADOR ===");
        roteador.ligar();
        roteador.conectarInternet();
        roteador.desligar();

        System.out.println("\n=== COMPUTADOR ===");
        computador.ligar();
        computador.conectarInternet();
        computador.desligar();
    }
}
