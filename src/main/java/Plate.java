
public class Plate {
	private int food;
	
    public Plate(int food) {
    	setFood(food);
      
    }
    
    public void decreaseFood(int n) {
        
        if (n > food) {
			throw new UnsupportedOperationException("� ������� ��� ������� ���");
		}
        
        if (n < 0) {
			throw new UnsupportedOperationException("� ������� ��� �� �����������!");
		}
                
        food -= n;
     }
    
    public void setFood(int food) {
    	if (food >= 0){
    		System.out.println("� ������ �������� ���: " + food);
        	this.food = food + getFood();	
    	} else {
			System.out.println("��� �� ����� ���� �������������, �� ������� �� �����!");
		}
		
	}

	public int getFood() {
		return food;
	}
	public void info() {
        System.out.println("� ������� " + food + " ���");
    }

}
