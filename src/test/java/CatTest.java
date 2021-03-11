import org.junit.Test;

import junit.framework.Assert;

public class CatTest {
	
	@Test
	public void eatTest1(){
		
		Plate plate = new Plate(10);
		Cat cat = new Cat( "Барсик", 10);
		cat.eat(plate);
		
		Assert.assertEquals(0, plate.getFood());

	}
	
	@Test
	public void eatTestBigEat(){
		
		Plate plate = new Plate(10);
		Cat cat = new Cat( "Барсик", 12);
		cat.eat(plate);
		
		Assert.assertEquals(10, plate.getFood());
		
	}
	
	@Test
	public void eatTestLittleEat(){
		
		Plate plate = new Plate(10);
		Cat cat = new Cat( "Барсик", 8);
		cat.eat(plate);
		
		Assert.assertEquals(2, plate.getFood());

		
		
	}
}
