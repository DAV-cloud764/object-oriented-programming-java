class animal_jr {

    public void soundmake(){
        System.out.println("The Dog is barking");
    }

    class Dog extends animal_jr{

        @Override
        public void soundmake() {
            super.soundmake();

            System.out.println("The Dod sound is nice");
        }
    }

    public static void main (String[] args){

        animal_jr dog = new animal_jr().new Dog();
        dog.soundmake();
    }
}