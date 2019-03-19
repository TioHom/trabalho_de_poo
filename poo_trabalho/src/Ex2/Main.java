package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Pessoa registrarPessoa() {
        Pessoa pessoa = new Pessoa();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome: ");
        pessoa.setNome(entrada.nextLine());

        System.out.println("Sexo: ( [ M ]   [ F ] )");
        pessoa.setSexo(entrada.next());
        
        System.out.println("Idade: ");
        pessoa.setIdade(entrada.nextInt());

        return pessoa;
    }

    public static void menu() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao = 0;

        do {
        	System.out.println("                 MENU                 ");
            System.out.println("( 1 ) Registrar");
            System.out.println("( 2 ) Pessoas");
            System.out.println("( 3 ) Pessoa");
            System.out.println("( 4 ) Sair");
            System.out.println("                                      ");
            Scanner entrada = new Scanner(System.in);

            opcao = entrada.nextInt();

            System.out.print("\n");
            switch (opcao) {
                case 1:
                    System.out.println("                 Registrar                ");

                    Pessoa pessoa = registrarPessoa();
                    pessoas.add(pessoa);

                    System.out.println(" ");
                    break;
                case 2:
                    if (pessoas.size() == 0) {
                        System.out.println("Nada registrado!");
                    } else {
                        System.out.println("Todos foram registrados!");

                        for (Pessoa ps : pessoas) {
                            ps.getAllInfo();
                        }
                    }

                    break;
                case 3:
                    System.out.println("Selecione alguem para saber sexo e idade");

                    int ps = entrada.nextInt();

                    if (ps > pessoas.size()) {
                        System.out.println("Pessoas registradas: " + pessoas.size());
                    } else {
                        pessoas.get(ps).getAllInfo();
                    }

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tem esse numero no menu infeliz? Tenta denovo");
                    break;
            }
        } while (opcao != 0);
    }

    public static void main(String args[]) {
        menu();
    }

}


