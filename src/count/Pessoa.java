package count;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Pessoa {
    private String id;
    private String name;
    private Integer idade;
    private Boolean premium;

    public Pessoa() {}

    public Pessoa(String id, String name, Integer idade, Boolean premium) {
        this.id = id;
        this.name = name;
        this.idade = idade;
        this.premium = premium;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public Boolean getPremium() {
        return premium;
    }

    List<Pessoa> lista = new LinkedList<>();

    public List<Pessoa> listaDePessoas() {
        Pessoa pessoa1 = new Pessoa(UUID.randomUUID().toString(), "Dowglas", 23, true);
        Pessoa pessoa2 = new Pessoa(UUID.randomUUID().toString(), "Danielly", 22, true);
        Pessoa pessoa3 = new Pessoa(UUID.randomUUID().toString(), "Flavinho do Pneu", 999, false);
        Pessoa pessoa4 = new Pessoa(UUID.randomUUID().toString(), "Xaulin Matador de porco", 55, true);
        Pessoa pessoa5 = new Pessoa(UUID.randomUUID().toString(), "Jeferson Caminhões", 16, false);
        Pessoa pessoa6 = new Pessoa(UUID.randomUUID().toString(), "Gabriel do Matagal", 28, false);
        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);
        lista.add(pessoa4);
        lista.add(pessoa5);
        lista.add(pessoa6);
        return lista;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", idade=" + idade +
                ", premium=" + premium +'}';
    }
}
