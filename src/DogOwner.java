//class
public class DogOwner {
    public String name;
    public final String sex;
    private Dog dog;
//constructor
    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

//Method om een hond aan een eigenaar te koppelen
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    //Method om de leeftijd van een hond te verhogen
    public void incAge() {
        this.dog.age += 1;
    }

    public String toString() {

        return this.name + " heeft een " + dog.sex + ", deze is " + dog.age + " jaar oud en van het soort: " + dog.species + ". De hond heet: " + dog.name;
    }

}

