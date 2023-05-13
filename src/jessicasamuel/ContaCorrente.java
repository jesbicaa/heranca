package jessicasamuel;

import java.text.DecimalFormat;

public class ContaCorrente {
    private int idCliente;
    private String numeroConta;
    private double saldo;
    DecimalFormat df = new DecimalFormat("###,##0.00");
    private String historico;
    private String status;

    public ContaCorrente(Cliente cliente, String numeroConta){
        this.idCliente = cliente.getId();
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.status = "Ativo";
        historico += ("Numero da Conta: " + numeroConta
            + "\nSaldo: " + df.format(saldo)  
            + "\nStatus: " + status + "\n"
            + "========================\n");
    }

    public double getSaldo() {
        System.out.println("Saldo Atual: " + saldo);
        return saldo;
    }

    public String getHistorico() {
        System.out.println(historico);
        return historico;
    }
    
    public void depositar(double valor){
        if (valor < 0) {
            System.out.println("O valor de depósito deve ser positivo");
        } else {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso");
            historico += ("Deposito: " + valor
                + "\nSaldo: " + df.format(saldo)  + "\n"
                + "========================\n");
        }
    }
    
    public void saque(double valorSaque){
        if ((valorSaque * 1.0033) > saldo ) {
            System.out.println("Valor em conta insuficiente");
        } else {
            saldo -= valorSaque * 1.0033;
            System.out.println("Saque feito com sucesso");
            historico += ("Saque: " + valorSaque
                + "\nSaldo: " + df.format(saldo)  + "\n"
                + "========================\n");
        }
    } 
}
