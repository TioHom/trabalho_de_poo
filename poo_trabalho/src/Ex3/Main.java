package Ex3;
import javax.swing.JOptionPane;

public class Main {
		public static void main(String[] args) {
			
			Conta_Corrente c1 = new Conta_Corrente();
			Menu Menu = new Menu();
			
			Integer exe = 1;
			while(exe != 0){
				
				exe = Menu.menu();
				
				switch(exe){
				case 1:
					double deposito = c1.efetuarDeposito();
					c1.depositar(deposito);
					break;
				case 2:
					double saque = c1.efetuarSaque();
					c1.sacar(saque);
					break;
				case 0:
					JOptionPane.showMessageDialog(null,"[Programa encerrado!]");
					break;
				 default:
					 JOptionPane.showMessageDialog(null,"Opcao Invalida!");
					 break;
				}
				
				Menu.c1.setSaldo(c1.getSaldo());
				
			}
			
		}
		
	}