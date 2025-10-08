package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Cliente eduardo = new Cliente();
        eduardo.setNome("Eduardo");

        Conta cc = new ContaCorrente(eduardo);
        Conta poupanca = new ContaPoupanca(eduardo);

        cc.depositar(1000);
        cc.transferir(500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        CartaoCredito cartao = new CartaoCredito(eduardo, 500);
        cartao.comprar(300);
        cartao.comprar(400); 
        cartao.imprimirFatura();    
    }
}
