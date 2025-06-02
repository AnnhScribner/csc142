public class Sanctuary {

    public static void main(String[] args) {

        Animal myAnimal = new Animal("Animal", 0);
        System.out.println("myAnimal: " + myAnimal);
        System.out.println();

        Mammal manny = new Mammal("Manny", 2000);
        System.out.println(manny);
        System.out.println();

        Bear smokey = new Bear("Smokey", 2020);
        System.out.println(smokey);
        System.out.println();

        // What class's getMovement method gets called?
        // MAMMAL class
        smokey.getMovement();

        Animal[] animals = new Animal[3];

        animals[0] = myAnimal;
        animals[1] = manny;
        animals[2] = smokey;

        smokey.getFeedYoung();

        for (Animal animal : animals) {
            if (animal instanceof Bear) {
                System.out.println(((Bear) animal).getClass());
            }

        }

        Animal fishy = new Fish("Fishy", 2025);
        System.out.println(((Mammal) fishy).getFeedYoung());

    }
}
