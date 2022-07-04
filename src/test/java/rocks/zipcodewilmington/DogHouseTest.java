package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    String givenName;
    Date givenBirthDate;
    Integer givenId;
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
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
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAdd(){
        Dog dog = new Dog(givenName,givenBirthDate,givenId);
        DogHouse.add(dog);
        Integer numOfDog = 1;
        Assert.assertEquals(numOfDog, DogHouse.getNumberOfDogs());
    }

    @Test
    public void testRemoveDog(){
        Dog dog = new Dog(givenName,givenBirthDate,givenId);
        DogHouse.remove(dog);
        Integer numOfDog = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(numOfDog, actual);
    }


    @Test
    public void testGetNumOfDogs(){
        Dog dog = new Dog(givenName,givenBirthDate,givenId);
        Integer numOfDogs = 0;
        Assert.assertEquals(numOfDogs,DogHouse.getNumberOfDogs());
    }

}
