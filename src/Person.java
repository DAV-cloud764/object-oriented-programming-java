public class Person {
    
    public void introduce(){
        System.out.println("Hello a'm the Person");
    }

    public class Student extends Person {

        public void study(){
            System.out.println("I am studying Java");
        }
    }

    public static void main(String[] args){
        Student S = new Person().new Student();

        S.introduce();
        S.study();
    }
}
