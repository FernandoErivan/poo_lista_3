public abstract class ContaBancaria{
    protected String titular;
    protected  double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$:\" + valor + \" na conta \" + titular");
    }

    public abstract void sacar(double valor);

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}