package com.mycompany.app;

public class CartaoCredito {
    private Cliente titular;
    private double limite;
    private double saldoDevedor;

    public CartaoCredito(Cliente titular, double limite) {
        this.titular = titular;
        this.limite = limite;
        this.saldoDevedor = 0;
    }

    public void comprar(double valor) {
        if(valor <= (limite - saldoDevedor)) {
            saldoDevedor += valor;
            System.out.println("Compra realizada no valor de R$" + valor);
        } else {
            System.out.println("Compra negada! Limite insuficiente.");
        }
    }

    public void pagarFatura(double valor) {
        saldoDevedor -= valor;
        if(saldoDevedor < 0) saldoDevedor = 0;
    }

    public void imprimirFatura() {
        System.out.println("=== Fatura do Cartão de Crédito ===");
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Limite total: R$" + limite);
        System.out.println("Saldo devedor: R$" + saldoDevedor);
        System.out.println("Limite disponível: R$" + (limite - saldoDevedor));
    }
}
