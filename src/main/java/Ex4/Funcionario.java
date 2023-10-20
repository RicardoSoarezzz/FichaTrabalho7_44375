package Ex4;

import java.time.LocalDate;
import java.util.Date;

public class Funcionario {


    private String nome;

    private String numero;

    private LocalDate[] ferias;


    public Funcionario(String nome, String numero, LocalDate[] ferias) {
        this.nome = nome;
        this.numero = numero;
        this.ferias = ferias;
    }

    public void marcarFerias(LocalDate date) {
        // First, create a new array with one additional element to accommodate the new date.
        LocalDate[] newFerias = new LocalDate[ferias.length + 1];

        // Copy the existing dates to the new array.
        System.arraycopy(ferias, 0, newFerias, 0, ferias.length);

        // Add the new date to the end of the new array.
        newFerias[newFerias.length - 1] = date;

        // Set the new array as the updated 'ferias' array.
        this.ferias = newFerias;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate[] getFerias() {
        return ferias;
    }

    public void setFerias(LocalDate[] ferias) {
        this.ferias = ferias;
    }
}
