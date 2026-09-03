class ContaBancariaEx02 {
    protected double saldo = 500.00;

    public final boolean validarSaque(double valor) {
        return valor <= saldo;
    }
}

class ContaCorrenteEx02 extends ContaBancariaEx02 {
    // Herda validarSaque(), mas nao pode sobrescreve-lo por ser final.
}

public class Exemplo02 {
    public static void main(String[] args) {
        ContaCorrenteEx02 conta = new ContaCorrenteEx02();
        double valorSaque = 1000.00;

        if (conta.validarSaque(valorSaque)) {
            System.out.println("Saque autorizado.");
        } else {
            System.out.println("ERRO: saldo insuficiente para realizar o saque.");
        }

        System.out.println();
        System.out.println("Observe:");
        System.out.println("- Saldo: R$ " + conta.saldo);
        System.out.println("- Saque solicitado: R$ " + valorSaque);
        System.out.println("- ContaCorrente herdou validarSaque().");
        System.out.println("- validarSaque() e final.");
        System.out.println("- por isso, a classe filha nao pode sobrescreve-lo.");
    }
}
