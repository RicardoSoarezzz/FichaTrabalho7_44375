package Ex4;

import java.time.LocalDate;
import java.util.Date;

public class Reuniao {

    private LocalDate data;

    private Sala sala;

    private String tema;


    public Reuniao(LocalDate data, Sala sala, String tema) {
        this.data = data;
        this.sala = sala;
        this.tema = tema;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
