package controllers;

import models.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController {

    private static List<Veiculo> veiculos = new ArrayList<>();

    public static void listar() {
        System.out.println("Listando veículos:");
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    public static void form() {
        System.out.println("Exibindo formulário para adicionar veículo.");
    }

    public static void detalhes(Long id) {
        Veiculo veiculo = veiculos.stream()
                                  .filter(v -> v.getId().equals(id))
                                  .findFirst()
                                  .orElse(null);
        if (veiculo == null) {
            System.out.println("Veículo não encontrado.");
        } else {
            System.out.println("Detalhes do veículo:");
            System.out.println(veiculo);
        }
    }
}
