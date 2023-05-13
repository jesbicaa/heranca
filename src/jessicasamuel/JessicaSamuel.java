package jessicasamuel;

public class JessicaSamuel {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(1, "c1");
        ContaCorrente Cc1 = new ContaCorrente(c1, "1234");
        Cc1.getHistorico();
        Cc1.depositar(100);
        Cc1.getHistorico();
        Cc1.saque(50);
        Cc1.getHistorico();
        Cc1.saque(50);
        Cc1.getHistorico();
        
        Cliente c2 = new Cliente(2, "c2");
        ContaCorrente Cc2 = new ContaCorrente(c2, "0000");
        Cc2.getHistorico();
        Cc2.depositar(100);
        Cc2.getSaldo();
    }
    
}
