package count;

import java.util.List;

public class CountClass {
    public static void main(String[] args) {
        System.out.println("Exemplo Count");

        List<Pessoa> lista = new Pessoa().listaDePessoas();

        long count = lista.stream()
                .filter(p -> p.getName().startsWith("D"))
                .count();
        System.out.println("Count: " + count);
    }
}
