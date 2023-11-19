
public class Main {
    public static void main(String[] args) {

        IdandPassword idandpassword= new IdandPassword();
        LoginPage loginPage = new LoginPage(idandpassword.getloginInfo());
    }
}
