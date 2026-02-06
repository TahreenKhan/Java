package Bank;

class Account{
    public String name;
    protected String email;
    private String password;  //this password is only accessible in this class itself. thus we use getter and setter method. 

    // getter and setter for private acess fields.
    public void setPassword(String pass){
        this.password = pass;
    }

    public String getPassword(){
        return this.password;
    }
}

public class Accessmodifiers {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna college";
        account1.email = "apnacollege@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
