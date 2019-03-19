package Ex5;
import java.util.Scanner;
import Ex5.GPS;

public class Usar_GPS {
	    public void main(Scanner leitor) {
	        boolean exec = true;
	        GPS Gps;
	        System.out.println("Deseja iniciar o gps com idioma e rota definida?");
	        System.out.println("1 - Sim");
	        System.out.println("2 - N�o");
	        if (leitor.nextInt() == 1) {
	            System.out.print("Digite o idioma desejado: ");
	            String idioma = leitor.next();
	            System.out.print("Digite a rota desejada: ");
	            String rota = leitor.next();
	            Gps = new GPS(idioma, rota);
	        } else {
	            Gps = new GPS();
	        }
	        while (exec) {
	            System.out.println("Selecione uma op��o");
	            System.out.println("1 - Definir idioma do GPS");
	            System.out.println("2 - Definir rota do GPS");
	            System.out.println("3 - Mostrar informa��es Atuais do GPS");
	            System.out.println("0 - Sair");
	            switch (leitor.nextInt()) {
	                case 1:
	                    System.out.print("1 - Digite o novo idioma: ");
	                    Gps.setIdioma(leitor.next());
	                    break;
	                case 2:
	                    System.out.print("1 - Digite a nova rota: ");
	                    Gps.setRota(leitor.next());
	                    break;
	                case 3:
	                    Gps.mostrar();
	                    break;
	                case 0:
	                    exec = false;
	                    break;
	            }
	        }
	    }
	}