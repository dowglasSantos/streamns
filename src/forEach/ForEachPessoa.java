package forEach;

import java.util.List;
import java.util.stream.Stream;

public class ForEachPessoa {
    public static void main(String[] args) {
        System.out.println("Exemplo forEach");
        System.out.println(" ");

        List<Pessoa> listPessoas = new Pessoa().listaDePessoas();

       listPessoas.stream()
                .forEach(pessoa -> System.out.println("exemploForEach: " + pessoa));

    }
}
