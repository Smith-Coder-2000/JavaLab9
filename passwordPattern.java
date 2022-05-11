package validator;
import java.util.regex.*;
import validate.*;
public class passwordPattern implements check.passCheck{
    public boolean isValidPattern(String password){
        String regex = "^(?=.*[0-9])"
                        + "(?=.*[a-z])(?=.*[A-Z])"
                        + "(?=.*[@#$%^&+=])"
                        + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        if(m.matches()){
            return true;
        }else{
            return false;
        }
    } 
}
