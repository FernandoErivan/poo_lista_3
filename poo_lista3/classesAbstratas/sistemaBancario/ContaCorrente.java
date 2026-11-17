public class ContaCorrente extends ContaBancaria {
    
    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    @Override 
    public void sacar(double valor){
        double taxa = 2.00;

        if(saldo >= valor + taxa){
            saldo -= (valor + taxa);
            System.out.println("Saldo de R$:" + valor + " da Conta Corrente " + titular);
        }else{
            System.out.println("Saldo insuficiente na Conta de " + titular);
        }
    }
}
