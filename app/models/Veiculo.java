package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Veiculo extends Model {
    public String placa;
    public String modelo;
    public int capacidade;

    public Veiculo(String placa, String modelo, int capacidade) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }
}
