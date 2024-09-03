package modelo;

// construtor herdade da classe AbsPropriedades
public class Pessoa extends AbsPropriedades{
    public Pessoa(String idade, String nome, int nota, int avaliacao) {
        super(idade, nome, nota, avaliacao); 
    }

// Getter's e Setter's de todos os atributos do construtor.
    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    @Override
    public void Executar() {
    }
}
