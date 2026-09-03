class ContaBancariaEx01 {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            // THROW: Lança uma exceção do tipo IllegalArgumentException (unchecked)
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}

public class Exemplo01 {
    public static void main(String[] args) {
        ContaBancariaEx01 conta = new ContaBancariaEx01();
        conta.depositar(100.00);

        // TRY/CATCH: Bloco usado para tentar uma operação arriscada e capturar o erro caso ele ocorra
        try {
            conta.sacar(500.00);
        } catch (IllegalArgumentException excecao) {
            System.out.println("Erro: " + excecao.getMessage());
        }

        System.out.println("Saldo final: " + conta.saldo);
    }
}
