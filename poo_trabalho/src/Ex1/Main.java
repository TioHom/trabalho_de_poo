package Ex1;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Estudante student = new Estudante();

        System.out.println("Nome do aluno: ");
        student.setaluno(sc.nextLine());

        System.out.println("Nome da sala: ");
        student.setSala(sc.nextLine());

        System.out.println("Nota 1: ");
        student.setN1(sc.nextDouble());

        System.out.println("Nota 2: ");
        student.setN2(sc.nextDouble());

        System.out.println("Nota 3: ");
        student.setN3(sc.nextDouble());

        System.out.println("Nota 4: ");
        student.setN4(sc.nextDouble());

        student.getAllInfo();
    }
}
