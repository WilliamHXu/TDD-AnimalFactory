package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // Given (cat data)


    @Test
    public void addCatTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        CatHouse house = new CatHouse();
        house.add(cat);

        int expected = 1;
        int actual = house.getNumberOfCats();

        Cat expCat = cat;
        Cat actCat = house.getCatById(0);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expCat, actCat);
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeTest1() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        CatHouse house = new CatHouse();
        house.clear();
        house.add(cat);

        house.remove(0);

        int expected = 0;
        int actual = house.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeTest2() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Cat cat2 = new Cat("Jacky", givenBirthDate, 1);

        CatHouse house = new CatHouse();
        house.add(cat);
        house.add(cat2);

        house.remove(cat);

        int expected = 1;
        int actual = house.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getCatByIdTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        CatHouse house = new CatHouse();
        house.clear();
        house.add(cat);

        Cat expCat = cat;
        Cat actCat = house.getCatById(0);

        Assert.assertEquals(expCat, actCat);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void getNumberOfCatsTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        CatHouse house = new CatHouse();
        house.clear();
        house.add(cat);

        int expected = 1;
        int actual = house.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}
