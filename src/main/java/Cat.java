
public class Cat {
	private String name;
    private int appetite;
    private boolean isFill;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFill = false;
    }
    
    public void eat(Plate plate) {
    	
        if (appetite <= plate.getFood()){
        	plate.decreaseFood(appetite);
        	isFill = true;
        } 
    }

	public String getName() {
		return name;
	}

	public String isFill() {
		if (isFill){
			return name + " сытый";
		} else {
			return name + " голодный";
		}
	}
    
    

}
