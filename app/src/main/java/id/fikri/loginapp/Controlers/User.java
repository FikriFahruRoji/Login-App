package id.fikri.loginapp.Controlers;

/**
 * Created by lowercase on 15/12/16.
 */

public class User {
    private String name, email, password, token_authentication;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken_authentication() {
        return token_authentication;
    }
    public void setToken_authentication(String token_authentication) {
        this.token_authentication = token_authentication;
    }
}
