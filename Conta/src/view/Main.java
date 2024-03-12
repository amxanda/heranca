package view;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Conta c = new Conta(1000);
        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(1000);

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);

        System.out.printf("Valor da Conta: %.2f%n", c.getSaldo());
        System.out.printf("Valor da Conta Corrente: %.2f%n", cc.getSaldo());
        System.out.printf("Valor da Conta poupanca: %.2f%n", cp.getSaldo());
    }
}