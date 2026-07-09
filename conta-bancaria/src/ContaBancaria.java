public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    // Construtor: nome sempre igual o da classe
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(double valor){
        saldo += valor; // saldo = saldo + valor
    }

    public void sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor; // saldo = saldo - valor
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);

    }
}
