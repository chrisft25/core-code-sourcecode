package solidExamples.singleResponsability;

public class Users {
    private String username;
    private String password;

    public void User (String username, String password){
        this.username = username;
        this.password = password;
    }

    public void registerUser(){
        String encrypted_password = PasswordEncrypter.encrypt(password);
        //registrar datos
    }

}
