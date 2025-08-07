package filter;

import java.util.List;
import java.util.stream.Stream;

public class FiltrandoPessoas {
    public static void main(String[] args) {
        System.out.println("Filtrando Pessoas");

        List<Pessoa> listaDePessoas = new Pessoa().listaDePessoas();

        Stream<Pessoa> filtrandoPessoas = listaDePessoas.stream()
                .filter(p -> p.getPremium().equals(true));
        for(Pessoa p : filtrandoPessoas.toList()) {
            System.out.println("Pessoa no plano Premium: " + p);
        }
    }
}
