public class Animal {

    public void eat(){
        System.out.println("The animal is eating");
    }

    public class Dog extends Animal {
        
        public void bark(){
            System.out.println("The Dog is Barking");
        }
    }

    public static void main(String[] args){
        Dog dog = new Animal().new Dog();

        dog.eat();
        dog.bark();
    }
}