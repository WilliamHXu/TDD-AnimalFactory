package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`


    @Test
    public void addDogTest() {
        // Given (cat data)
        String givenName = "Rex";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        DogHouse house = new DogHouse();
        house.clear();
        house.add(dog);

        int expected = 1;
        int actual = house.getNumberOfDogs();

        Dog expDog = dog;
        Dog actDog = house.getDogById(0);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expDog, actDog);
    }
    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeTest1() {
        // Given (cat data)
        String givenName = "Bono";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        DogHouse house = new DogHouse();
        house.clear();
        house.add(dog);

        house.remove(0);

        int expected = 0;
        int actual = house.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void removeTest2() {
        // Given (cat data)
        String givenName = "Barko";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Dog dog2 = new Dog("Black Jack", givenBirthDate, 1);

        DogHouse house = new DogHouse();
        house.add(dog);
        house.add(dog2);

        house.remove(dog);

        int expected = 1;
        int actual = house.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogByIdTest() {
        // Given (cat data)
        String givenName = "Old Yeller";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        DogHouse house = new DogHouse();
        house.clear();
        house.add(dog);

        Dog expDog = dog;
        Dog actDog = house.getDogById(0);

        Assert.assertEquals(expDog, actDog);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();


    }
}
