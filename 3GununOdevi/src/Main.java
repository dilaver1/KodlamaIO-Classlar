
public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setId(38);
        instructor.setFullName("Engin Demirog");
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setPassword("engin123");
        instructor.setSalary(5000);
        instructor.setDailyWorkHours("6 Saat");

        String specialCodeForInstructor = instructor.getSpecialCode();
        System.out.println(specialCodeForInstructor);
        Student student = new Student();
        student.setFullName("Dilaver Agabeyov");
        student.setId(42);
        student.setEmail("dilaver052@gmail.com");
        student.setPassword("dilaver0953");//gercek pass deil deneme!
        student.setHomework("Yeni bir proje yapma odevi");

        String specialCodeForStudent = student.getSpecialCode();
        System.out.println(specialCodeForStudent);

        UserManager user = new UserManager();
        StudentManager studentManager =new StudentManager();
        InstructorManager instructorManager = new InstructorManager();
        user.signUp(instructor.getEmail(), instructor.getPassword());
        user.signIn(instructor.getEmail(), instructor.getPassword());
        studentManager.inspection();
        instructorManager.createHomework("Kodlama io gibi bi proje yapma odevi verildi!");
        

    }

}
