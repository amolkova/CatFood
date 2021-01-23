
public class Start {

	public static void main(String[] args) {
		Cat[] catsArray = new Cat[5];
		catsArray[0] = new Cat("Барсик", 5);
		catsArray[1] = new Cat("Буся", 3);
		catsArray[2] = new Cat("Мурзик", 2);
		catsArray[3] = new Cat("Пуся", 4);
		catsArray[4] = new Cat("Пушок", 5);
				
		Plate plate = new Plate(8);
		
		plate.info();
		
		for (Cat cat : catsArray) {
			cat.eat(plate);
			System.out.println(cat.isFill());
		}
		
		plate.info();
		
//		6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
		plate.setFood(10);
		
		plate.info();
	}

}
