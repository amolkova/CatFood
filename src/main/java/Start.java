
public class Start {

	public static void main(String[] args) {
		Cat[] catsArray = new Cat[5];
		catsArray[0] = new Cat("������", 5);
		catsArray[1] = new Cat("����", 3);
		catsArray[2] = new Cat("������", 2);
		catsArray[3] = new Cat("����", 4);
		catsArray[4] = new Cat("�����", 5);
				
		Plate plate = new Plate(8);
		
		plate.info();
		
		for (Cat cat : catsArray) {
			cat.eat(plate);
			System.out.println(cat.isFill());
		}
		
		plate.info();
		
//		6. �������� � ������� �����, � ������� �������� ����� ���� �� ��������� ��� � �������.
		plate.setFood(10);
		
		plate.info();
	}

}
