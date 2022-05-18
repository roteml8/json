package json;

public class Runner {

	public static void main(String[] args) {
		
		Serialization.serializePastry();
		Deserialization.deserializePastry();
		Serialization.serializePastryList();
		Deserialization.deserializePastryList();
		Serialization.serializePastryMap();
		Deserialization.deserializePastryMap();

	}

}
