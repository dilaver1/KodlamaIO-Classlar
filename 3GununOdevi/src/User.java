
public class User {

   private int id;
   private String fullName;
   private String email;
   private String password;
   private String specialCode; //Kullanicinin isminin ilk 3 harfi + id si onun ozel kodu olsun :)

    public String getSpecialCode() {
        return "Ozel kodunuz : "+fullName.substring(0,3)+id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
    
    
}


