package controllers;

import models.Motorista;
import play.mvc.Controller;

import java.util.List;

public class MotoristaController extends Controller {
    public static void lista() {
        List<Motorista> motoristas = Motorista.findAll();
        render(motoristas);
    }

    public static void detalhes(Long id) {
        Motorista motorista = Motorista.findById(id);
        render(motorista);
    }

    public static void form(Long id) {
        Motorista motorista = id == null ? null : Motorista.findById(id);
        render(motorista);
    }

    public static void salvar(Motorista motorista) {
        motorista.save();
        lista();
    }

    public static void excluir(Long id) {
        Motorista motorista = Motorista.findById(id);
        motorista.delete();
        lista();
    }
}
