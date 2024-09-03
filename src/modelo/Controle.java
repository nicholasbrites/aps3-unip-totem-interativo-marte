package modelo;

public class Controle extends AbsPropriedades // herdando atributos e construtores da classe 
{
    // construtor herdado da classe AbsPropriedades
    public Controle(String idade, String nome) {
        super(idade, nome);
    }
    
    // método que foi implementado da classe IMetodos na classe AbsPropriedades
    @Override
    public void Executar()
    {
        Estaticos.MENSAGEM = ""; // define MENSAGEM da classe Estaticos como vazia/nula
        AbsPropriedades validacao = new Validacao(idade, nome); // instanciando um objeto da classe Validacao com os parâmetros de idade e nome
    }
}
