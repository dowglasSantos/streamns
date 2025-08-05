package simpleStreams;

import java.util.List;

public class SimpleStreams {
    public static void main(String[] args) {
        List<String> listaDeNomes = List.of("Dowglas", "Danielly", "bcdfe");
        listaDeNomes.stream()
                .filter(n -> n.contains("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
