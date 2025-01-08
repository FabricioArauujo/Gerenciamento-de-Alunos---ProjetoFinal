package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class Rota extends Model {
    public String origem;
    public String destino;
    public double distancia;

    @ManyToOne
    public Veiculo veiculo;

    @ManyToOne
    public Motorista motorista;

    public Rota(String origem, String destino, double distancia, Veiculo veiculo, Motorista motorista) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.veiculo = veiculo;
        this.motorista = motorista;
    }
}
