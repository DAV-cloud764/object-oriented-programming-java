public class Person_Jr {

    private String name;
    private int age;

    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            System.out.println("Enter Valid name");
        }
    }

    public void setAge(int age){
        if (age >= 1 && 120 >= age ){
            this.age = age;
        } else {
            System.out.println("Enter a Valid Age");
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}

class Student extends Person_Jr {

    private int marks;

    public void setMarks(int marks){
        if (marks >=  0 && 100 >= marks ){
            this.marks = marks;
        } else {
            System.out.println("Enter a Valid Marks");
        }
    }

    public int getMarks(){
        return marks;
    }

    public String calculateGrade(){
        if (80 <= marks && marks <= 100){
            return "A";
        } else if (70 <= marks && marks <= 79){
            return "B";
        } else if (60 <= marks && marks <= 69){
            return "C";
        } else {
            return "F";
        }
    }
    

    public void displayStudent(){
        System.out.println("The Student Name is: " + getName());
        System.out.println("The Student Age is: " + getAge());
        System.out.println("The Student Marks is: " + getMarks());
        System.out.println("The Student Grade is: " + calculateGrade());
    }
}

class Person_JrMain {

    public static void main (String [] args){
        Student S = new Student();
        S.setName("David");
        S.setAge(20);
        S.setMarks(80);

        S.displayStudent();
    }
}