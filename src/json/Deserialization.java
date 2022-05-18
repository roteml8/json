package json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class Deserialization {

	public static void deserializePastry() {
		
		File file = new File(Path.of("myFiles", "pastry.json").toString());
		try (FileReader fileReader = new FileReader(file)) {

			JsonReader jsonReader = new JsonReader(fileReader);

			Gson gson = new Gson();
			Pastry pastry = gson.fromJson(jsonReader, Pastry.class);
			System.out.println(pastry);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deserializePastryList() {
		
		File file = new File(Path.of("myFiles", "pastryList.json").toString());
		
		try (FileReader fileReader2 = new FileReader(file)) {
			
			Gson gson = new Gson();
			//collections need TypeToken
			JsonReader jsonReader = new JsonReader(fileReader2);
			Type pastryListType = new TypeToken<ArrayList<Pastry>>(){}.getType();
			List<Pastry> pastryList = gson.fromJson(jsonReader,pastryListType);
			System.out.println("==========================");
			pastryList.forEach(System.out::println);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deserializePastryMap() {
		
		File file = new File(Path.of("myFiles", "pastryMap.json").toString());
		
		try (FileReader fileReader2 = new FileReader(file)) {
			
			Gson gson = new Gson();
			//collections need TypeToken
			JsonReader jsonReader = new JsonReader(fileReader2);
			Type pastryMapType = new TypeToken<HashMap<Label,List<Pastry>>>(){}.getType();
			HashMap<Label,List<Pastry>> pastryMap = gson.fromJson(jsonReader,pastryMapType);
			System.out.println("==========================");
			pastryMap.keySet().stream().forEach(k->System.out.println(k+":"+pastryMap.get(k)));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
