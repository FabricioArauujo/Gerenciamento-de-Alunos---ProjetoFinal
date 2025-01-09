package controllers;

import models.Rota;

import java.util.ArrayList;
import java.util.List;

public class RotaController {

    private static List<Rota> rotas = new ArrayList<>();

    public static void listar() {
        System.out.println("Listando rotas:");
        for (Rota rota : rotas) {
            System.out.println(rota);
        }
    }

    public static void detalhes(Long id) {
        Rota rota = rotas.stream()
                         .filter(r -> r.getId().equals(id))
                         .findFirst()
                         .orElse(null);
        if (rota == null) {
            System.out.println("Rota não encontrada.");
        } else {
            System.out.println("Detalhes da rota:");
            System.out.println(rota);
        }
    }
}
