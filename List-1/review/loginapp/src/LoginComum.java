public class LoginComum implements ILogin {

    private final String usuario;

    private final String senha;

    public LoginComum(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String logar() {
        String textoAux = " - LOGINCOMUM -> " + this.usuario;

        if (usuario.length() + senha.length() == 20)
            return "00001234" + textoAux;

        return "15001234" + textoAux;
    }

}
