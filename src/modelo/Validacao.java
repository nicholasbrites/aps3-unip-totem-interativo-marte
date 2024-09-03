package modelo;

public class Validacao extends AbsPropriedades // herdando atributos e construtores da classe 
{

    // construtor herdado da classe AbsPropriedades
    public Validacao(String idade, String nome) {
        super(idade, nome);
    }

    // método que foi implementado da classe IMetodos na classe AbsPropriedades
    @Override
    public void Executar()
    {
        if(nome.equals("") || idade.equals(""))
        {
            Estaticos.MENSAGEM += "ERRO! \n\n";
        }
        
        // confere se somente o nome está irregular para retornar mensagem de erro para o usuário
        if(nome.equals(""))
        {
            Estaticos.MENSAGEM += "O campo NOME deve ter entre 1 e 15 caracteres. \n";
        }
        // confere se somente a idade está irregular para retornar a mensagem de erro para o usuário
        if(idade.equals(""))
        {
                 Estaticos.MENSAGEM += "O campo IDADE deve ter entre 1 e  3 caracteres. \n";
        }
    }
}
