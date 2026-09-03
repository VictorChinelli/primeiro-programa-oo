// EXCEÇÃO CUSTOMIZADA: Criação de uma classe de exceção própria herdando de RuntimeException (unchecked)
class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancariaEx02 {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            // THROW e EXCEÇÃO CUSTOMIZADA: Lança a nova exceção criada por nós
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}

public class Exemplo02 {
    public static void main(String[] args) {
        ContaBancariaEx02 conta = new ContaBancariaEx02();
        conta.depositar(100.00);

        // TRY/CATCH: Captura especificamente a nossa exceção customizada
        try {
            conta.sacar(500.00);
        } catch (SaldoInsuficienteException excecao) {
            System.out.println("Erro: " + excecao.getMessage());
        }

        System.out.println("Saldo final: " + conta.saldo);
    }
}
