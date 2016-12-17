package id.fikri.loginapp.Controlers;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lowercase on 15/12/16.
 */

public class Users {
    @SerializedName("users")
    public List<UserItem> users;
    public List<UserItem> getUsers() { return users; }
    public void setUsers(List<UserItem> users) { this.users = users; }
    public Users(List<UserItem> users) { this.users = users; }

    public class UserItem {
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
}
