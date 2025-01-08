package controllers;

import models.Rota;
import models.Veiculo;
import models.Motorista;
import play.mvc.Controller;

import java.util.List;

public class RotaController extends Controller {
    public static void lista() {
        List<Rota> rotas = Rota.findAll();
        render(rotas);
    }

    public static void detalhes(Long id) {
        Rota rota = Rota.findById(id);
        render(rota);
    }

    public static void form(Long id) {
        Rota rota = id == null ? null : Rota.findById(id);
        List<Veiculo> veiculos = Veiculo.findAll();
        List<Motorista> motoristas = Motorista.findAll();
        render(rota, veiculos, motoristas);
    }

    public static void salvar(Rota rota, Long veiculoId, Long motoristaId) {
        rota.veiculo = Veiculo.findById(veiculoId);
        rota.motorista = Motorista.findById(motoristaId);
        rota.save();
        lista();
    }

    public static void excluir(Long id) {
        Rota rota = Rota.findById(id);
        rota.delete();
        lista();
    }
}
