public class User {
    private int id;
    private String email;
    private String username;
    private String password;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    @Override
    public String toString() {
        return "ID usera: "+ id + "\n" +
                "nick usera: " + username + "\n" +
                "email usera: " + email + "\n" +
                "haslo usera: " + password;
    }

}

