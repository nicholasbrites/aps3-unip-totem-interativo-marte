package TotemAPS;

import apresentacao.frmPrincipal; //importa a frmPrincipal da pasta 'apresentacao'

public class TotemAPS {
    public static void main(String[] args)
    {
        frmPrincipal frmP = new frmPrincipal(null, true); //instancia um objeto da frmPrincipal
        frmP.setVisible(true); //torna o objeto visível para o usuário
    }
}
