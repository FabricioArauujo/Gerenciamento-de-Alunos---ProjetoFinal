package models;

public class Rota {
    private Long id;
    private String descricao;

    public Rota(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Rota [id=" + id + ", descricao=" + descricao + "]";
    }
}
