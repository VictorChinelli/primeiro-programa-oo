// TRY-WITH-RESOURCES / AUTOCLOSEABLE: A classe implementa AutoCloseable para fechar o recurso sozinha
class ConexaoSimulada implements AutoCloseable {
    public ConexaoSimulada() {
        System.out.println("Conexão aberta.");
    }

    public void executar() {
        System.out.println("Executando operação...");
    }

    @Override
    public void close() {
        System.out.println("Conexão fechada.");
    }
}

public class Exemplo03 {
    public static void main(String[] args) {
        // TRY-WITH-RESOURCES: Garante que o recurso dentro dos parênteses será fechado automaticamente ao final
        try (ConexaoSimulada conexao = new ConexaoSimulada()) {
            conexao.executar();
        }
    }
}
