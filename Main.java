// INTERFACE: Contrato que obriga a implementar o método pagar
interface MeioDePagamento {
    void pagar(double valor);
}

// CLASSE: Molde para criar objetos do tipo Pix
class Pix implements MeioDePagamento {
    // SOBRESCRITA: Implementa o método da interface
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }
}

// CLASSE: Molde base para as contas bancárias
class ContaBancaria {
    // ATRIBUTO e ENCAPSULAMENTO: 'protected' protege o saldo, mas permite acesso às subclasses
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Saldo: R$ " + saldo);
    }
}

// HERANÇA: ContaCorrente herda características e comportamentos de ContaBancaria
class ContaCorrente extends ContaBancaria {
    
    // SOBRESCRITA: Modifica o comportamento do método depositar herdado
    @Override
    public void depositar(double valor) {
        // Usa 'super' para chamar o método da classe pai descontando a taxa
        super.depositar(valor - 1.00);
        System.out.println("Foi descontada uma taxa de R$ 1,00.");
    }
}

public class Main {
    public static void main(String[] args) {
        // POLIMORFISMO E CRIAÇÃO DE OBJETO: Variável da interface apontando para um objeto Pix
        MeioDePagamento pagamento = new Pix();
        pagamento.pagar(100.00);

        // CRIAÇÃO DE OBJETO: Instanciação de um objeto ContaCorrente na memória
        ContaCorrente corrente = new ContaCorrente();
        corrente.depositar(100.00);
    }
}
