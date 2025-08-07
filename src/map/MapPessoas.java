package map;

import java.util.List;
import java.util.stream.Stream;

public class MapPessoas {
    public static void main(String[] args) {
        List<Pessoa> listaDePessoas = new Pessoa().listaDePessoas();

        Stream<Boolean> mapPessoas =  listaDePessoas.stream()
                .map(p -> p.getIdade() > 18);
        for(Boolean p : mapPessoas.toList()) {
            System.out.println("MapPessoas: " + p);
        }
    }
}
