public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog("Cotton", 6, "Pomeranian", 7);

        System.out.println("Name: " + dog1.getName() +
                           "\n\tAge (Years): " + dog1.getAge() +
                           "\n\tBreed: " + dog1.getBreed());

        System.out.println("Name: " + dog2.getName() +
                           "\n\tWeight (Lbs): " + dog2.getWeight() +
                           "\n\tWeight (Kg): " + dog2.ToKilo());

        System.out.println(dog3.toString() +
                           "\n\tWeight (Kg): " + dog3.ToKilo());

        System.out.println("I have " + Dog.getDogCount() + " dogs in total.");
    }
}