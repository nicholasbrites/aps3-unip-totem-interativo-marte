package modelo;

//tornando a classe AbsPropriedades uma classe abstrata para que ela possa herdar seus atributos e construtores para outras classes

import java.util.ArrayList;

//implementando métodos declarados na interface IMetodos
public abstract class AbsPropriedades implements IMetodos
{
    //criando atributos públicos, idade e nome do tipo String, e nota e avaliacao do tipo int
    public String idade; 
    public String nome;
    public int nota;
    public int avaliacao;
    
    // cria uma lista estática do tipo Pessoa(classe)
    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    //criando um construtor com os parâmetros idade e nome
    public AbsPropriedades(String idade, String nome) {
        this.idade = idade;
        this.nome = nome;
        this.Executar();
    }
    
     //criando um construtor com os parâmetros idade, nome, nota e avaliacao
     public AbsPropriedades(String idade, String nome, int nota, int avaliacao) {
        this.idade = idade;
        this.nome = nome;
        this.nota = nota;
        this.avaliacao = avaliacao;
        this.Executar();
    }
}
