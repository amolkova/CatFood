
public class Plate {
	private int food;
	
    public Plate(int food) {
    	setFood(food);
      
    }
    
    public void decreaseFood(int n) {
        
        if (n > food) {
			throw new UnsupportedOperationException("В тарелке нет столько еды");
		}
        
        if (n < 0) {
			throw new UnsupportedOperationException("В тарелку еду не доплевывать!");
		}
                
        food -= n;
     }
    
    public void setFood(int food) {
    	if (food >= 0){
    		System.out.println("В тарелу добавили еды: " + food);
        	this.food = food + getFood();	
    	} else {
			System.out.println("Еда не может быть отрицательной, из тарелки НЕ БРАТЬ!");
		}
		
	}

	public int getFood() {
		return food;
	}
	public void info() {
        System.out.println("В тарелке " + food + " еды");
    }

}
