import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // User.admins = new ArrayList<User>();
        // User.admins.add(new User("John"));
        // User.admins.add(new User("Callen"));
        // User.admins.add(new User("Alice"));
        // User.print_admins_name();

        Student s = new Student();
        System.out.println(s.get_verified());
        s.set_membership("GOLD");
        System.out.println(s.get_membership());


    }
}
