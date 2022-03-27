package projeto_banco;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		Menu objMenu = new Menu();
		
		int prosseguir = JOptionPane.showConfirmDialog(null, objMenu.txtBoasVindasMenu(),"BANCO - ELS",0);
		
		try {
			if(prosseguir == JOptionPane.YES_OPTION) {
				objMenu.setNome(JOptionPane.showInputDialog("O seu nome:"));
				objMenu.setConta(Double.parseDouble(JOptionPane.showInputDialog("INSIRA OS 6 DIGITOS DA SUA CONTA: \n Ex: 123456")));
				objMenu.menu();
			}else {
				JOptionPane.showMessageDialog(null,"OPERACAO FINALIZADA COM SUCESSO!");
				System.exit(0);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ALGO DEU ERRADO, TENTE EXECUTAR NOVAMENTE", "ERRO INESPERADO", 0);
		}
		
	}
	
}
