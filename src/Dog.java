class Dog {
    
    public void makesound(){
        System.out.println("The Dog is Barking");
    }
}

class Animal extends Dog{

    @Override
    public void makesound(){
        System.out.println("The sound of dog is nice");
    }
}

class DogTest {

    public static void main(String[] args){

        Animal dog = new Animal();
        dog.makesound();
    }
}
