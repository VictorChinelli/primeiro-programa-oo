import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExemploChecked {
    public static void main(String[] args) {
        // EXCEÇÃO CHECKED e TRY/CATCH: FileReader lança FileNotFoundException (checked),
        // o que obriga o compilador a exigir tratamento obrigatório via try/catch.
        try {
            FileReader arquivo = new FileReader("dados.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}