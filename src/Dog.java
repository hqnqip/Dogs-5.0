public class Dog
{
    //Instance Variables
    private String name;
    private int age;
    private String breed;
    private int weight;
    private static int dogCount;
    //^^ This is the static variable


    //Constructors
    public Dog(String name, int age, String breed, int weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    }


    //Getters
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public int getWeight()
    {
        return weight;
    }
    public static int getDogCount()
    {
        return dogCount;
    }


    //Setters
    public void setName(String myName)
    {
        name = myName;
    }
    public void setAge(int myAge)
    {
        age = myAge;
    }
    public void setBreed(String myBreed)
    {
        breed = myBreed;
    }
    public void setWeight(int myWeight)
    {
        weight = myWeight;
    }


    //Brain Methods
    //Convert to kilograms.
    public int ToKilo()
    {
        return (int) (weight * 0.453592);
    }


    public String toString()
    {
        String output = "Name: " + name +
                        "\n\tAge (Years): " + age +
                        "\n\tBreed: " + breed +
                        "\n\tWeight (Lbs): " + weight;
        return output;
    }


    //Add Static Variable Dog Count.
}

//Instance: Name, Age, Breed, Weight (LBS)
//Make constructor using "this" notation.
//Make getters and setters.
//Make a toString();
//Brain Method: Convert the dog's weight to kilogram and output.
//Static Variable: Dog Count (To count the number of dogs.)
//Instantiate dog1: Fang, 5, Husky, 80
//            dog2: Piper, 3, Australian Shepherd, 45
//            dog3: Cotton, 6, Pomeranian, 7

//Output: Fang Breed and Age + Piper Weight
//        + Cotton Full Description + How Many Dogs.