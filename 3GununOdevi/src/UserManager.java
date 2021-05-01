
public class UserManager {
    public UserManager(){System.out.println("Bu bir yapici bloktur ve parametresiz cagirildiginda calisir!");}
    
    private User user;
    public UserManager(User user){this.user=user;
        System.out.println("User added!");}

    public void signUp(String email, String password) {
        System.out.println("Kayit oldunuz : " +" mail kismina "+ email + "password kismina " + password + " yazarak giris yapabilirsiniz");
    }

    public void signIn(String email, String password) {
        System.out.println("Giris yaptiniz!");
    }

    public int totalWorkHours(int yesterdayWorkHour, int todayWorkHour) {
        return yesterdayWorkHour + todayWorkHour;
    }
}
