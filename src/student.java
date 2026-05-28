public class student {

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] arg){
        student S = new student();
        S.setName("David");
        S.setAge(-15);

        System.out.println(S.getName());
        System.out.println(S.getAge());

    }
}