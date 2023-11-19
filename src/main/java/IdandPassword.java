import java.util.HashMap;

public class IdandPassword {

    HashMap<String, String> logininfo = new HashMap<>();
    IdandPassword(){
        logininfo.put("Zawed", "12345");
        logininfo.put("Safwan","1234");
        logininfo.put("Nazmus","1234");
        logininfo.put("Sakib","1234");
    }
    protected HashMap getloginInfo(){
        return logininfo;
    }
}
