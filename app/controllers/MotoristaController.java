package controllers;

import models.Motorista;

import java.util.ArrayList;
import java.util.List;

public class MotoristaController {

    private static List<Motorista> motoristas = new ArrayList<>();

    public static void listar() {
        System.out.println("Listando motoristas:");
        for (Motorista motorista : motoristas) {
            System.out.println(motorista);
        }
    }

    public static void form() {
        System.out.println("Exibindo formulário para adicionar motorista.");
    }

    public static void detalhes(Long id) {
        Motorista motorista = motoristas.stream()
                                        .filter(m -> m.getId().equals(id))
                                        .findFirst()
                                        .orElse(null);
        if (motorista == null) {
            System.out.println("Motorista não encontrado.");
        } else {
            System.out.println("Detalhes do motorista:");
            System.out.println(motorista);
        }
    }
}
