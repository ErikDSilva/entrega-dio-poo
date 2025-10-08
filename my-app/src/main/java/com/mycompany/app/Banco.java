package com.mycompany.app;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;
 
    public void listarContas() {
        System.out.println("=== Contas do Banco " + nome + " ===");
        contas.forEach(conta -> {
            System.out.println("Conta nº " + conta.getNumero() + " - Cliente: " + conta.cliente.getNome());
        });
    }
}

