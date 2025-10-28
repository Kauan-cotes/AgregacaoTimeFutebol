import java.util.ArrayList;

public class Time {
    private String nome;
    private  Estadio estadio;

    private ArrayList<SocioTorcedor> socioTorcedor;

    public Time(String nome, Estadio estadio) {
        this.setNome(nome);
        this.setEstadio(estadio);

        this.socioTorcedor = new ArrayList<>(); //alterar
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

}
