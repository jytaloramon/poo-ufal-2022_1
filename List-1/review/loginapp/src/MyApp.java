public class MyApp {

    private ILogin metodoLogin;

    public MyApp(ILogin metodoLogin) {
        this.metodoLogin = metodoLogin;
    }

    public void setLogin(ILogin metodoLogin) {
        this.metodoLogin = metodoLogin;
    }

    public void logarNoAPP() {
        String token = metodoLogin.logar();

        System.out.println("\n");
        if (isLogado(token)) {
            System.out.println("Tá Logado = " + token);
            return;
        }

        System.out.println("Não tá logado <" + token + ">");
    }

    private boolean isLogado(String token) {
        return token.startsWith("0000");
    }

}
