package forEach;

import count.Pessoa;

import java.util.List;

public class ForEachPessoa {
    public static void main(String[] args) {
        System.out.println("Exemplo forEach");
        System.out.println(" ");

        List<Pessoa> listPessoas = new Pessoa().listaDePessoas();

       listPessoas.stream()
                .forEach(pessoa -> System.out.println("exemploForEach: " + pessoa));

    }
}
