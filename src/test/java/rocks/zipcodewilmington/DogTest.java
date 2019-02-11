package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    public void constructorTest() {
        // Given (dog data)
        String givenName = "Barko";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`

    @Test
    public void speakTest(){
        // Given (dog data)
        String givenName = "Barko";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);


        // When (we retrieve data from the cat)
        String expected = "bark!";
        String actual = dog.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDate() {
        // Given (dog data)
        String givenName = "Barko";
        Date givenBirthDate = new Date();
        Date expected = new Date(0);
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (a dog's name is set to the given name)
        dog.setBirthDate(expected);

        // Then (we expect to get the given name from the dog)
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest() {
        // Given (cat data)
        String givenName = "Barko";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        Integer before = dog.getNumberOfMealsEaten();
        Food food = new Food();
        dog.eat(food);
        Integer after = dog.getNumberOfMealsEaten();
        Integer expected = before + 1;

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, after);
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIDTest() {
        // Given (cat data)
        String givenName = "Barko";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void isAnimalTest() {
        // Given (cat data)
        String givenName = "Barko";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        boolean expected = true;
        boolean actual = dog instanceof Animal;

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void isMammalTest() {
        // Given (cat data)
        String givenName = "Barko";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        boolean expected = true;
        boolean actual = dog instanceof Mammal;

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
