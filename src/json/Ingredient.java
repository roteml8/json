package json;

public class Ingredient {
	
	protected String name;
	protected double weight;
	
	public Ingredient(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", weight=" + weight + "]";
	}

	
	

}
