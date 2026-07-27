public class Pupil {

    private String name;
    private int age;

    //Setter
    public void setName(String name){
        this.name = name;
    }

    //Setter
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Invalid Age!");
        }
    }

    //Getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        Pupil pupil = new Pupil();

        pupil.setName("David");
        pupil.setAge(38);

        System.out.println(pupil.getName());
        System.out.println(pupil.getAge());
    }
    
}

        

