class Student_jr {

    private String name;

    public void setName(String name) {

        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }
}

class Teacher extends Student_jr {

    public void displayTeacher() {
        System.out.println("Teacher Name: " + getName());
    }
}

public class Main {

    public static void main(String[] args) {

        Teacher t = new Teacher();

        t.setName("Hosea");

        t.displayTeacher();
    }
}