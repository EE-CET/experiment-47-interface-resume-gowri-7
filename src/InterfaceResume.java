import java.util.Scanner;

interface Resume {
    // Declare method
    void biodata();
}

class Teacher implements Resume {
    // Attributes
    String name;
    String qualification;
    int experience;

    // Implement biodata() method
    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

public class InterfaceResume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        String name = sc.nextLine();
        String qualification = sc.nextLine();
        int experience = sc.nextInt();

        // Create object and assign values
        Teacher teacher = new Teacher();
        teacher.name = name;
        teacher.qualification = qualification;
        teacher.experience = experience;

        // Call method
        teacher.biodata();
    }
}
