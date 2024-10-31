import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Student s = new Student();
        s.set_name("Stident");
        Teacher t = new Teacher();
        t.set_name("Teacher");

        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        
       
        for (User u : User.admins) {
            u.verify();
        }
    }
}
