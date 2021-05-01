
public class Instructor extends User {

   private String dailyWorkHours; //Gunluk calisma saati
   private double salary;

    public String getDailyWorkHours() {
        return dailyWorkHours;
    }

    public void setDailyWorkHours(String dailyWorkHours) {
        this.dailyWorkHours = dailyWorkHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
