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
    String givenName;
    Date givenBirthDate;
    Integer givenId;
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

@Test
    public void testAddCat(){
    String givenName = "Ted";
    Date givenBirthDate = new Date(1993,07,22);
    Integer givenID = 1;
    Cat Ted = new Cat(givenName,givenBirthDate,givenId);
    CatHouse.add(Ted);
    int numOfCats = 1;
    int actualNumOfCat = CatHouse.getNumberOfCats();
    Assert.assertEquals(numOfCats, actualNumOfCat);

    CatHouse.clear();
}

@Test
    public void testRemoveCat(){
    Cat cat = new Cat(givenName,givenBirthDate,givenId);
    CatHouse.remove(cat);
    Integer numOfCats = 0;
    Assert.assertEquals(numOfCats, CatHouse.getNumberOfCats());
}

@Test
    public void testGetNumberOfCats(){
    Cat cat = new Cat(givenName,givenBirthDate,givenId);
    Integer numOfCats = 0;
    Assert.assertEquals(numOfCats, CatHouse.getNumberOfCats());
}


}
