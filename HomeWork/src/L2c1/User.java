package L2c1;

public class User {

    int id;
    String login, password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
    public User(){
        this (0 , "guest", "");
    }
    public String getTextInfo(){
        return "ID : " + id + "; Логин: " + login + "; Пароль:" + password; 
    }
    public int getId(){
        return id;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setId(){
        setId(0);
    }
    public void setLogin(){
        setLogin("guest");
    }
    public void setPassword(){
        setPassword("");
    }
    
    public static void main(String[] args) {
        User u1 = new User(2,"admin" ,"asd");
        User u2 = new User(1,"admin1" ,"asd1");
        User[] u_arr = new User[2];
        u_arr [0] = new User (2,"admin" ,"asd") ;
        u_arr [1] = new User (1,"admin1" ,"asd1") ;
        
       // for (User temp: u_arr){
       //     System.out.println(temp.id + " " + temp.login + " " + temp.password); 
       // }
        User u = new User();
        u.setId(1);
        u.setLogin("Admin");
        u.setPassword("asd");
        
        System.out.println(u.getId()); 
        System.out.println(u.getLogin()); 
        System.out.println(u.getPassword()); 
        
        System.out.println(u.getTextInfo());
        
        User u3 = new User();
        u3.setId();
        u3.setLogin();
        u3.setPassword();
        
        
        
        
    }
}
