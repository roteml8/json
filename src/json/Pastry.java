package json;

import java.util.List;

public class Pastry {

	protected String name;
	protected Label label;
	protected int calories;
	protected List<Ingredient> ingredients;
	
	public Pastry(String name, Label label, int calories, List<Ingredient> ingredients) {
		this.name = name;
		this.label = label;
		this.calories = calories;
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Pastry [name=" + name + ", label=" + label + ", calories=" + calories + ", ingredients=" + ingredients
				+ "]";
	}
	
	
}
