public class Users {
    private String login;
    private String password;
    
    public Users(String login, String password){
        this.login = login;
        this.password = password;
    }
    
    void pass(String password){
        if (this.password.equals(password))
            System.out.println("Success");
        else
            System.out.println("Failure");
    }
}