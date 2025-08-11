package optional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        System.out.println("Exemplo Optional");

        List<Pessoa> lista = new Pessoa().listaDePessoas();

        Optional<Pessoa> opicional = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));
        opicional.ifPresent(System.out::println);
    }
}
