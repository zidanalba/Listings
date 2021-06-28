package paket;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.Gson;  
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class mainJsonToObject {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		JsonParser jsonparser = new JsonParser();
		
		// Masukkan file untuk dibaca
		File file = new File("C:\\Users\\Hp\\eclipse-workspace\\ETS\\src\\paket\\barang.json");
		FileReader reader = new FileReader(file);
		
		Object obj = jsonparser.parse(reader);
		
//		JsonObject paketJson = (JsonObject)obj;		
		
		JsonArray array = (JsonArray)obj;
		
		for (int i = 0; i < array.size(); i++) {
			JsonObject paket = (JsonObject)array.get(i);
			
			JsonObject status = (JsonObject)paket.get("status");
			int code = (int)status.get("code").getAsInt();
			String description = (String)status.get("description").toString();
			
			JsonObject servicePackage = (JsonObject)paket.get("servicePackage");
			String service = (String)paket.get("service").toString();
			int value = (int)paket.get("value").getAsInt();
			
			JsonObject city = (JsonObject)paket.get("city");
			String origin = (String)status.get("origin").toString();
			String destination = (String)status.get("destination").toString();
			
			int weight = (int)paket.get("weight").getAsInt();
			int quantity = (int)paket.get("quantity").getAsInt();
			int priceItem = (int)paket.get("priceItem").getAsInt();
			String productName = (String)paket.get("productName").toString();
			
			System.out.println(productName + " | " + quantity + " | " + weight + " | " + destination +
					" | " + service + " | " + value + " | " + quantity*priceItem + weight*value);
		}
		
//		for (int i = 0; i < array.size(); i++) {
//			JsonObject paket = (JsonObject)array.get(i);
//			
//			JsonObject status = (JsonObject)paket.get("status");
//			String code = (String)status.get("code").toString();
//			String description = (String)status.get("description").toString();
//			
//			
//			Object servicePackage = (Object)paket.get("servicePackage");
//			String service = (String)paket.get("service").toString();
//			int value = (int)paket.get("value").getAsInt();
//			
//			Object city = (Object)paket.get("city");
//			String origin = (String)status.get("origin").toString();
//			String destination = (String)status.get("destination").toString();
//			
//			int weight = (int)paket.get("weight").getAsInt();
//			int quantity = (int)paket.get("quantity").getAsInt();
//			int priceItem = (int)paket.get("priceItem").getAsInt();
//			String productName = (String)paket.get("productName").toString();
//			
//			System.out.println(productName + " | " + quantity + " | " + weight + " | " + destination +
//					" | " + service + " | " + value + " | " + quantity*priceItem + weight*value);
//			
//		}
		
	}

}
