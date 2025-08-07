package collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class colletPessoa {
    public static void main(String[] args) {
        System.out.println("Usando Collect");

        Pessoa lista = new Pessoa();

        Map<String, List<Pessoa>> collectStream = lista.listaDePessoas().stream()
                .collect(Collectors.groupingBy(p -> p.getPremium() ? "sim" : "não"));
        for(Pessoa p : collectStream.get("sim")) {
            System.out.println("Clientes Premium: " + p);
        }

        System.out.println(" ");

        for(Pessoa p : collectStream.get("não")) {
            System.out.println("Clientes Free: " + p);
        }

    }
}
