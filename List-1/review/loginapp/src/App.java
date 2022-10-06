public class App {
    public static void main(String[] args) throws Exception {

        ILogin loginComum = new LoginComum("ramon-comu", "123456789");

        MyApp myApp = new MyApp(loginComum);
        myApp.logarNoAPP();

        ILogin loginGoogle = new LoginGoogle(10);
        myApp.setLogin(loginGoogle);
        myApp.logarNoAPP();
    }
}
