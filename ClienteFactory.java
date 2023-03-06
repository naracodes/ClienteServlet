package br.com.polotech925.hellowordservlet;

public class ClienteFactory {
    public static Cliente cadastrar(String tipoConta){
        Cliente cliente;
        switch(tipoConta){
            case "poupanca":
                cliente = new ClientePoupanca();
                break;
            case "corrente":
                cliente = new ClienteCorrente();
                break;
            default:
                throw new RuntimeException("Tipo de Cliente inválido");
        }
        return cliente;
    }
}
