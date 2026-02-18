

/*
Opdracht
Geef de klasse Dog de volgende instance variables: name, species, age, sex. Datatypes mag je zelf verzinnen.
De sex en species variables mogen na instantiatie niet meer aangepast worden.

Geef de klasse DogOwner de volgende instance variables: name, sex.
Er zijn geen restricties op getters en setters.

Geef de DogOwner klasse ook een variabele van type Dog. De DogOwner is in dit geval de eigenaar.
De DogOwner-klasse moet methodes bevatten om de naam van de hond aan te passen én de leeftijd met 1 te verhogen.

Geef de DogOwner een toString()-methode en druk dit af:
"""
[NAAM-DogOwner] heeft een [reu/teef],
deze is [xx] jaar oud en van het soort: [SOORT-Dog].
De hond heet: [NAAM-Dog]
"""

Instantieer hieronder de objecten en laat zien dat je code werkt.
 */
void main(String[] args) {

//Objecten of instances gemaakt met de Dog constructor
    Dog dog = new Dog("Barra", "vuilnisbak", 12, "teef");
    Dog skye = new Dog("Skye", "Collie", 14, "teef");
    Dog zoe = new Dog("Zoe", "Collie", 12, "teef");
    Dog kiwi = new Dog("Kiwi", "Collie", 4, "teef");
    Dog skip = new Dog("Skip", "Collie", 4, "reu");

    //Objecten of instances gemaakt met de dogOwner constructor
    DogOwner nick = new DogOwner("Nick", "male");
    DogOwner cees = new DogOwner("Cees", "male");
    DogOwner karin = new DogOwner("Karin", "female");

    //Honden toegewezen aan dogOwners met de setDog method.
    nick.setDog(dog);
    cees.setDog(skye);
    cees.incAge();

    //Blijkbaar herkent Java vanzelf dat 'cees' een dogOwner is?
    IO.println(cees.toString());


}
