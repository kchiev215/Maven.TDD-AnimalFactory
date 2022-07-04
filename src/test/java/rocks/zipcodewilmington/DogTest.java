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
public class DogTest {
    String givenName;
    Date givenBirthDate;
    Integer givenID;

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        Dog dog = new Dog(givenName, givenBirthDate, givenID);
        String expectedName = "Adam";
        dog.setName(expectedName);
        String actualDogName = dog.getName();
        Assert.assertEquals(expectedName, actualDogName);
    }

    @Test
    public void testSetBirthDate() {
        Dog dog = new Dog(givenName,givenBirthDate,givenID);
        Date expected = new Date(1993,07,22);
        dog.setBirthDate(expected);
        Date actualBirthDate = dog.getBirthDate();
        Assert.assertEquals(expected, actualBirthDate);
    }

    @Test
    public void testSpeck(){
        Dog dog = new Dog(givenName,givenBirthDate,givenID);
        dog.speak();
        String actualSpeak = dog.speak();
        Assert.assertEquals("bark!", actualSpeak);

    }

    @Test
    public void eat(){
        Dog dog = new Dog(givenName,givenBirthDate,givenID);
        Integer numberOfMeals = 1;
        Food nibbles = new Food();
        dog.eat(nibbles);
        Assert.assertEquals(numberOfMeals, dog.getNumberOfMealsEaten());

    }

    @Test
    public void testGetID() {
        Dog dog = new Dog(givenName,givenBirthDate,givenID);
        Integer actual = dog.getId();
        Assert.assertEquals(givenID,actual);

    }

    @Test
    public void checkAnimalInheritance() {
        Dog dog = new Dog(givenName,givenBirthDate,givenID);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void checkMammalInheritance() {
        Dog dog = new Dog(givenName,givenBirthDate,givenID);
        Assert.assertTrue(dog instanceof Mammal);
    }




}
