package controllers;

import models.Veiculo;
import play.mvc.Controller;

import java.util.List;

public class VeiculoController extends Controller {
    public static void lista() {
        List<Veiculo> veiculos = Veiculo.findAll();
        render(veiculos);
    }

    public static void detalhes(Long id) {
        Veiculo veiculo = Veiculo.findById(id);
        render(veiculo);
    }

    public static void form(Long id) {
        Veiculo veiculo = id == null ? null : Veiculo.findById(id);
        render(veiculo);
    }

    public static void salvar(Veiculo veiculo) {
        veiculo.save();
        lista();
    }

    public static void excluir(Long id) {
        Veiculo veiculo = Veiculo.findById(id);
        veiculo.delete();
        lista();
    }
}
