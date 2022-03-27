package projeto_banco;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
	private String NomeUsuario;
	private double ContaUsuario;
	private double SaldoUsuaro = 0.0;
	
	//GETTERS
	public String getNome() {
		return this.NomeUsuario;
	}
	public double getConta() {
		return this.ContaUsuario;
	}
	public double getSaldo() {
		return this.SaldoUsuaro;
	}
	
	//SETTERS
	public void setNome(String nome) {
		this.NomeUsuario = nome;
	}
	public void setConta(double conta) {
		this.ContaUsuario = conta;
	}
	public void setSaldo(double saldo) {
		this.SaldoUsuaro = saldo;
	}
	
	//Variaveis
	private String txtBoasVindas = "BANCO ELS \nSEJA BEM-VINDO(A)\n\nDeseja continuar?";
	private String AcaoMenu;
	
	public String txtBoasVindasMenu() {
		return this.txtBoasVindas;
	}
	
	public void menu() {
		 Scanner scan = new Scanner(System.in);
		int acao;
		
        do {
        	
        	acao = Integer.parseInt(JOptionPane.showInputDialog(null,"USUARIO: " + this.NomeUsuario+
					"\nCONTA: "		 + this.ContaUsuario+
					"\nSALDO ATUAL: R$:"+ this.SaldoUsuaro+
					"\n ______________________"+
					"\nSelecione o que deseja fazer:"+
					"\n(1) - Adicionar Fundos"+
					"\n(2) - Retirada de Fundos"+
					"\n(3) - Finalizar")); 

            switch(acao){
            
                case 1 -> {
                	double NovoValor = Double.parseDouble(JOptionPane.showInputDialog("INSIRA O VALOR DE DEPOSITO:"));
                	depositar(NovoValor);
                }
                case 2 -> { 
                	double NovoValor = Double.parseDouble(JOptionPane.showInputDialog("INSIRA O VALOR DE RETIRADA:"));
                	saque(NovoValor);
                }
                case 3 -> {
                	JOptionPane.showMessageDialog(null,"SESSAO FINALIZADA");
        			System.exit(0);
                }
                
                default -> {
                    JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!", "ATENCAO", 0);
                }
            }
        } while (acao != 3);
         
	}
	
	
	public double saque(double valor){
        if(this.SaldoUsuaro < valor){
            JOptionPane.showMessageDialog(null, "OPERACAO NAO PROCESSADA \nSALDO INSUFICIENTE!", "erro", 0);
        }else{
            double novoSaldo = this.SaldoUsuaro - valor;
            this.SaldoUsuaro = novoSaldo;
            JOptionPane.showMessageDialog(null, "RETIRADA REALIZADA COM SUCESSO!");
        }
        return SaldoUsuaro;
    }
    
    public double depositar(double valor){
        double novoSaldo = this.SaldoUsuaro + valor;
        this.SaldoUsuaro = novoSaldo;
        JOptionPane.showMessageDialog(null, "DEPOSITO PROCESSADO COM SUCESSO!");
        return SaldoUsuaro;
    }
	
	
}
