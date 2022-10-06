public class LoginGoogle implements ILogin {

    private final int id;

    public LoginGoogle(int id) {
        this.id = id;
    }

    @Override
    public String logar() {
        String textoAux = " - LOGINGOOGLE -> id = " + id;

        if (id % 2 == 0)
            return "00009999" + textoAux;

        return "15009999" + textoAux;

    }

}
