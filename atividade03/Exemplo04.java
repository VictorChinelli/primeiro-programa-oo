sealed class ContaBancariaEx04 
        permits ContaCorrenteEx04, ContaPoupancaEx04, ContaEmpresarialEx04 {
    protected double saldo;
}

final class ContaCorrenteEx04 extends ContaBancariaEx04 {
}

non-sealed class ContaPoupancaEx04 extends ContaBancariaEx04 {
}

class ContaPoupancaPremium extends ContaPoupancaEx04 {
}

sealed class ContaEmpresarialEx04 
        extends ContaBancariaEx04 
        permits ContaEmpresarialPequena {
}

final class ContaEmpresarialPequena extends ContaEmpresarialEx04 {
}

public class Exemplo04 {
    public static void main(String[] args) {
        ContaPoupancaPremium conta = new ContaPoupancaPremium();

        System.out.println("Conta poupanca premium criada.");
        System.out.println();
        System.out.println("Observe a hierarquia que voce criou:");
        System.out.println();
        System.out.println("ContaBancaria (sealed)");
        System.out.println(" |");
        System.out.println(" +-- ContaCorrente (final)");
        System.out.println(" |     -> a heranca termina aqui");
        System.out.println(" |");
        System.out.println(" +-- ContaPoupanca (non-sealed)");
        System.out.println(" |     -> a heranca foi reaberta");
        System.out.println(" |     -> ContaPoupancaPremium pode herdar dela");
        System.out.println(" |");
        System.out.println(" +-- ContaEmpresarial (sealed)");
        System.out.println("       -> continua controlando a heranca");
        System.out.println("       -> permite ContaEmpresarialPequena");
        System.out.println();
        System.out.println("Conclusao:");
        System.out.println("final fecha a heranca.");
        System.out.println("sealed controla quem pode herdar.");
        System.out.println("non-sealed reabre a heranca.");
    }
}