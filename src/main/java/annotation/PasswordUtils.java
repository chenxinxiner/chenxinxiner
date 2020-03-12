package annotation;

import java.util.List;

/**
 * @author 10745
 * @date 2020/3/11 21:39
 **/
public class PasswordUtils {
    @UserCase(id = 47, description = "Passwords must contain at last one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UserCase(id = 48)
    public String encrcptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UserCase(id = 49, description = "New password can`t  equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }

}
