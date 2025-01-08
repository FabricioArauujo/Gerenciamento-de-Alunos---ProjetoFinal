package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Motorista extends Model {
    public String nome;
    public String cnh;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }
}
