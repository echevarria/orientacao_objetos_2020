package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

        ContaCorrente guilherme = new ContaCorrente(1000);
        ContaCorrente matheus = new ContaCorrente(500);

        contas.add(guilherme);
        contas.add(matheus);
        contas.add(new ContaCorrente(9999));

        System.out.println(contas.size());
        
        contas.forEach((conta) -> System.out.println(conta.getSaldo()));
        
    }
}