package reduce;

import java.util.LinkedList;
import java.util.List;

public class ReducePessoa {
    public static void main(String[] args) {
        System.out.println("Exemplo Reduce");

        List<Integer> listaDeNumeros = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Integer exemploReduce = listaDeNumeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("exemploReduce: " + exemploReduce);
    }
}
