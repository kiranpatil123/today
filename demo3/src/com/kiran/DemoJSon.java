package com.kiran;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class DemoJSon {
	public static void main(String[] args) {

		JsonArray jsonArry = new JsonArray();
		jsonArry.add("patientId");
		jsonArry.add("pulserate");
		jsonArry.add("temperature");
		jsonArry.add("bloodPressure");
		jsonArry.add("sugarLevel");
		jsonArry.add("doctor");
		jsonArry.add("timestamp");

		JsonObject timeStampJSon = new JsonObject();
		timeStampJSon.addProperty("type", "string");
		timeStampJSon.addProperty("minLength", 1);

		JsonObject pulserateJson = new JsonObject();
		pulserateJson.addProperty("type", "number");

		JsonObject temperatureJson = new JsonObject();
		temperatureJson.addProperty("type", "number");

		JsonObject bloodPressureJson = new JsonObject();
		bloodPressureJson.addProperty("type", "number");

		JsonObject sugarLevelJson = new JsonObject();
		sugarLevelJson.addProperty("type", "number");

		JsonObject doctorJson = new JsonObject();
		doctorJson.addProperty("type", "string");
		doctorJson.addProperty("minLength", 1);

		JsonObject timestampJson = new JsonObject();
		timestampJson.addProperty("type", "string");
		timestampJson.addProperty("minLength", 1);

		JsonObject propertiesJson = new JsonObject();
		propertiesJson.add("patientId", timeStampJSon);
		propertiesJson.add("pulserate", pulserateJson);
		propertiesJson.add("timestamp", timestampJson);
		propertiesJson.add("doctor", doctorJson);
		propertiesJson.add("sugarLevel", sugarLevelJson);
		propertiesJson.add("bloodPressure", bloodPressureJson);
		propertiesJson.add(" temperature", temperatureJson);

		JsonObject schemaJson = new JsonObject();
		schemaJson.addProperty("description", "");
		schemaJson.addProperty("type", "object");

		schemaJson.add("properties", propertiesJson);
		schemaJson.add("required", jsonArry);

		JsonObject schema = new JsonObject();

		schema.add("schema", schemaJson);

		System.out.println(schema.toString());

		JsonElement jsonElement = schema.get("schema");
		System.out.println(jsonElement);

		JsonObject asJsonObject = jsonElement.getAsJsonObject();
		JsonArray asJsonArray = asJsonObject.getAsJsonArray("required");
		System.out.println(asJsonArray);
		JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("properties");
		System.out.println(asJsonObject2);
		/*
		 * JsonElement remove = asJsonObject2.remove("patientId");
		 * System.out.println(remove);
		 */

		JsonObject asJsonObject3 = asJsonObject2.remove("pulserate").getAsJsonObject();
		System.out.println(asJsonObject3);

		System.out.println(asJsonObject2);

		Map<String, Integer> map = new HashMap<>();
		map.put("hi", 1);
		map.put("hello", 3);

		Gson gson = new Gson();
		JsonObject asJsonObject4 = gson.toJsonTree(map).getAsJsonObject();
		System.out.println(asJsonObject4);
		asJsonObject4.addProperty("hi1", 2);
		System.out.println(asJsonObject4);

	}
}
