class person_jr2 {
    
    public void introduce(){
        System.out.println("I am a person");
    }
}

class student extends person_jr2 {

    @Override
    public void introduce(){

        super.introduce();
        System.out.println("I am a student");
    }
}

public class Main{

    public static void main(String[] args){
        student s = new student();
        s.introduce();
    }
}
