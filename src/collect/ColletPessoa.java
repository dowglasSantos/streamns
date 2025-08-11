package collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ColletPessoa {
    public static void main(String[] args) {
        System.out.println("Usando Collect");

        List<Pessoa> lista = new Pessoa().listaDePessoas();

        // Retorna uma lista com base em outra

        List<Pessoa> listaDeClientesPremium = lista.stream()
                .filter(n -> n.getPremium().equals(true))
                .collect(Collectors.toList());
        listaDeClientesPremium.forEach(System.out::println);

        System.out.println("*******************");
        System.out.println("*******************");

        List<Pessoa> listaDeClientesFree = lista.stream()
                .filter(n -> n.getPremium().equals(false))
                .collect(Collectors.toList());
        listaDeClientesFree.forEach(System.out::println);

        System.out.println("*******************");
        System.out.println("*******************");

        Map<String, Pessoa> createMapList = lista.stream()
                .collect(Collectors.toMap(Pessoa::getId, Pessoa::new));
        createMapList.forEach((k, v) -> System.out.println(k + " / " + v));
    }
}
