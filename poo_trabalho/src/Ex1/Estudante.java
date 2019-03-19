package Ex1;
public class Estudante {
    public String aluno;
    private String sala;
    public double n1, n2, n3, n4, media;

    Estudante() {}

    public void setaluno(String aluno) {
        this.aluno = aluno;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getaluno() {
        return aluno;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getN3() {
        return n3;
    }

    public double getN4() {
        return n4;
    }

    public String getSala() {
        return sala;
    }

    public double getMedia() {
        return this.media = (this.n1 + this.n2 + this.n3 + this.n4) / 4;
    }

    public void getAllInfo() {
    	
    	System.out.println("-------------------------------");
        System.out.println("Nome do Aluno: " +  this.aluno);
        System.out.println("Sala: " +  this.sala);
        System.out.println("Nota 1: " +  this.n1);
        System.out.println("Nota 2: " +  this.n2);
        System.out.println("Nota 3: " +  this.n3);
        System.out.println("Nota 4: " +  this.n4);
        System.out.println("Media: " +  this.getMedia());
        System.out.println("-------------------------------");
        
    }
}