class ContaBancariaEx01 {
    private final String titular;

    public ContaBancariaEx01(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }
}

public class Exemplo01 {
    public static void main(String[] args) {
        ContaBancariaEx01 conta = new ContaBancariaEx01("Maria");

        System.out.println("Titular: " + conta.getTitular());
        System.out.println();
        System.out.println("Observe:");
        System.out.println("- titular recebeu o valor Maria no construtor.");
        System.out.println("- titular foi declarado como final.");
        System.out.println("- por isso, ele nao pode ser reatribuido.");
    }
}