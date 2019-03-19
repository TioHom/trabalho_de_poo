package Ex8;

public class Main {
	    public static void main(String args[]) {
	    
	    Numero_Complexo complex = new Numero_Complexo(2,3,3,4);
	    Numero_Complexo complex1 = new Numero_Complexo(2,3,5,5);
	    Numero_Complexo complex2 = new Numero_Complexo(3,6,2,6);
	    Numero_Complexo complex3 = new Numero_Complexo(3,6,2,6);
	    Numero_Complexo complex4 = new Numero_Complexo(0,0,0,0);
	    Numero_Complexo complex5 = new Numero_Complexo(0,0,0,0);
	    complex.adicao();
	    complex1.subtracao(); 
	    complex2.multiplicacao();
	    complex3.divisao();
	    complex4.inicializa(8,7);
	    complex4.eIgual();
	    complex4.imprimenumero();
	   
	    }    
	}
