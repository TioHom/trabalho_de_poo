package Ex7;
import java.util.Scanner;

public class Controle_Remoto {
		TV t1 = new TV();
		
		public void ligarTV(TV t1) {
			t1.setStatus(true);	
		}
		
		public void desligarTV(TV t1) {
			t1.setStatus(false);
		}
		
		public void aumentarVolume(TV t1){
			int volume = t1.getVolume();
			t1.setVolume(volume+1);
		}
		
		public void diminuirVolume(TV t1) {
			int volume = t1.getVolume();
			t1.setVolume(volume-1);
		}
		
		public void escolherCanal(TV t1, int canal) {
			Scanner input = new Scanner(System.in);
					
			System.out.println("Digite o canal desejado: ");
			canal = input.nextInt();
					
			if(canal > 999) {
				System.out.println("Sinal nao encontrado.");
				t1.setCanal(canal);
			}
			
			else if(canal < 0)
				System.out.println("Canal inexistente.");
			
			else t1.setCanal(canal);
		}
		
		public void aumentarCanal(TV t1) {
			int canal = t1.getCanal();
			t1.setCanal(canal+1);
		}
		
		public void diminuirCanal(TV t1) {
			int canal = t1.getCanal();
			t1.setCanal(canal-1);
		}	
}