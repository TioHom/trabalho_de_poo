package Ex3;
import javax.swing.JOptionPane;

public class Menu {
	
	Conta_Corrente c1 = new Conta_Corrente(); 
	
	public Integer menu(){
		double saldo = c1.getSaldo();
		String Menu = "[Saldo da conta: " + saldo +"]";
		Menu += "\n[0] - Sair";
		Menu += "\n[1] - Depositar.";
		Menu += "\n[2] - Sacar";
		Menu += "\n[ ------------------------- ]";
		Menu += "\nInforme o numero da opção desejada:  ";
		String xOpcao = JOptionPane.showInputDialog(null,Menu);
		c1.setSaldo(saldo); 
		return Integer.parseInt(xOpcao);
	}			
}