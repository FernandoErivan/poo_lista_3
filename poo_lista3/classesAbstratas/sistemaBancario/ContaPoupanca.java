public class ContaPoupanca extends ContaBancaria {
    
    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }

    @Override 
    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saldo de R$:" + valor + " da Conta Poupança " + titular);
        }else{
            System.out.println("Saldo insuficiente para saque na Conta de " + titular);
        }
    }
}
