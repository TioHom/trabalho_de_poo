package Ex2;

public class Pessoa {
	public String nome;
    public String sexo;
    public int idade;

    Pessoa() {}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void getAllInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Nome: " +  this.nome);
        System.out.println("Sexo: " +  this.sexo);
        System.out.println("Idade: " +  this.idade);
        System.out.println("----------------------------------------");
    }
}



