package modelo;

public class DadosUsuarios {
	
    public int agencia;
    public int conta;
    public String cliente;
    public double saldo;
    
    public void abrirConta(String nomeCliente, int agencia, int conta, double saldo ) {
    	
    	this.cliente= nomeCliente;
    	this.agencia= agencia;
    	this.conta= conta;
    	this.saldo= saldo;
    	
    	System.out.println("Conta aberta com suscesso");
    	
    }

}
