package json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class Serialization {
	
	public static void serializePastry() {

		List<Ingredient> ingredients = List.of(new Ingredient("Flour", 100), new Ingredient("Sugar",50));
		Pastry pastry = new Pastry("Cake", Label.PAREVE, 500, ingredients);
		Gson gson = new Gson();
		String pastryJson = gson.toJson(pastry);
		System.out.println(pastryJson);
		File file = new File("myFiles/pastry.json");
		try (FileWriter writer = new FileWriter(file)){
			writer.write(pastryJson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void serializePastryList()
	{
		List<Ingredient> ingredients1 = List.of(new Ingredient("Flour", 100), new Ingredient("Sugar",50));
		Pastry pastry1 = new Pastry("Cake", Label.PAREVE, 500, ingredients1);
		
		List<Ingredient> ingredients2 = List.of(new Ingredient("Flour", 150), new Ingredient("Sugar",50), new Ingredient("Milk",100));
		Pastry pastry2 = new Pastry("Pancake", Label.DAIRY, 800, ingredients2);
		
		List<Ingredient> ingredients3 = List.of(new Ingredient("Flour", 200), new Ingredient("Meat",100));
		Pastry pastry3 = new Pastry("Meat Sub", Label.MEAT, 300, ingredients3);
		
		List<Pastry> pastries = List.of(pastry1, pastry2, pastry3);
		
		Gson gson = new Gson();
		String pastryListJson = gson.toJson(pastries);
		System.out.println(pastryListJson);
		File listFile = new File("myFiles/pastryList.json");
		try (FileWriter listWriter = new FileWriter(listFile)){
			listWriter.write(pastryListJson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void serializePastryMap()
	{
		List<Ingredient> ingredients1 = List.of(new Ingredient("Flour", 100), new Ingredient("Sugar",50));
		Pastry pastry1 = new Pastry("Cake", Label.PAREVE, 500, ingredients1);
		
		List<Ingredient> ingredients2 = List.of(new Ingredient("Flour", 150), new Ingredient("Sugar",50), new Ingredient("Milk",100));
		Pastry pastry2 = new Pastry("Pancake", Label.DAIRY, 800, ingredients2);
		
		List<Ingredient> ingredients3 = List.of(new Ingredient("Flour", 200), new Ingredient("Meat",100));
		Pastry pastry3 = new Pastry("Meat Sub", Label.MEAT, 300, ingredients3);
		
		Map<Label,List<Pastry>> pastriesByLabel = new HashMap<>();
		pastriesByLabel.put(Label.PAREVE, List.of(pastry1));
		pastriesByLabel.put(Label.DAIRY, List.of(pastry2));
		pastriesByLabel.put(Label.MEAT, List.of(pastry3));

		Gson gson = new Gson();
		String pastryMapJson = gson.toJson(pastriesByLabel);
		System.out.println(pastryMapJson);
		File listFile = new File("myFiles/pastryMap.json");
		try (FileWriter listWriter = new FileWriter(listFile)){
			listWriter.write(pastryMapJson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
