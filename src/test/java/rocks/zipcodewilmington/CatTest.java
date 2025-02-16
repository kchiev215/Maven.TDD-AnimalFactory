package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    String givenName;
    Date givenBirthDate;
    Integer givenID;

    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName(){
        Cat cat = new Cat(givenName, givenBirthDate, givenID);
        String expectedName = "Kitty";
        cat.setName(expectedName);
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testSetBirthDay(){
        Cat cat = new Cat(givenName,givenBirthDate,givenID);
        Date expectedDOB = new Date(1993,07,22);
        cat.setBirthDate(expectedDOB);
        Date actualDOB = cat.getBirthDate();
        Assert.assertEquals(expectedDOB, actualDOB);
    }

    @Test
    public void testCatSpeak(){
        Cat cat = new Cat(givenName,givenBirthDate,givenID);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCatEat() {
        Cat cat = new Cat(givenName, givenBirthDate, givenID);
        Integer numberOfMealsEaten = 1;
        Food nibbles = new Food();
        cat.eat(nibbles);
        Assert.assertEquals(numberOfMealsEaten, cat.getNumberOfMealsEaten());

    }

    @Test
    public void testGetID() {
        Cat cat = new Cat(givenName, givenBirthDate, givenID);
        Integer actual = cat.getId();
        Assert.assertEquals(givenID, actual);
    }

    @Test
    public void testAnimalInheritance(){
        Cat cat = new Cat(givenName, givenBirthDate, givenID);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void checkMammalInheritance() {
        Cat cat = new Cat(givenName,givenBirthDate,givenID);
        Assert.assertTrue(cat instanceof Mammal);
    }




}
