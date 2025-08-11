package allmatch;

import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        System.out.println("Exemplo AllMatch");

        List<Pessoa> lista = new Pessoa().listaDePessoas();

        boolean exemploAllMatch = lista.stream()
                .allMatch(n -> n.getPremium().equals(true));
        System.out.println("exemploAllMatch " + exemploAllMatch);
    }
}
