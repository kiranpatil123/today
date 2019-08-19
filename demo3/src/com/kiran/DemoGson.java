package com.kiran;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

class Employee {
	private int eid;
	private String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
}

public class DemoGson {

	public static void main(String[] args) {

		/*
		 * Employee emp = new Employee(); emp.setEid(1); emp.setEname("Kamala");
		 * 
		 * Gson gson1 = new Gson(); JsonElement jsonTree = gson1.toJsonTree(emp);
		 * JsonObject asJsonObject2 = jsonTree.getAsJsonObject(); JsonElement
		 * jsonElement4 = asJsonObject2.get("eid"); System.out.println(jsonElement4);
		 */

		JsonObject jsonObject1 = new JsonObject();
		jsonObject1.addProperty("Eid", "1");
		jsonObject1.addProperty("kiran", "patil");

		JsonObject jsonObject5 = new JsonObject();
		jsonObject5.addProperty("Eid", "2");
		jsonObject5.addProperty("kiran", "2patil");

		JsonArray jsonArray = new JsonArray();
		jsonArray.add(jsonObject1);
		jsonArray.add(jsonObject5);

		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("Eid", "1");
		jsonObject.addProperty("kiran", "patil");
		jsonObject.add("Employee", jsonObject1);
		jsonObject.add("employeesArray", jsonArray);

		System.out.println(jsonObject.toString());

		String s1 = jsonObject.toString();
		JsonObject jsonObject2 = new JsonObject();

		Gson gson = new Gson();
		String json = gson.toJson(s1);

		// System.out.println(json);

		JsonParser jsonParser = new JsonParser();
		JsonElement element = jsonParser.parse(s1);
		JsonObject asJsonObject = element.getAsJsonObject();
		JsonElement jsonElement = asJsonObject.get("Employee");
		System.out.println(jsonElement);

		JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("Eid");
		System.out.println(jsonElement2);

		JsonElement element2 = asJsonObject.get("kiran");
		System.out.println(element2);

		JsonArray asJsonArray = asJsonObject.get("employeesArray").getAsJsonArray();
		int size = asJsonArray.size();
		System.out.println(size);

		for (int i = 0; i < size; i++) {
			JsonElement jsonElement3 = asJsonArray.get(i);
			System.out.println(jsonElement3);
		}

	}

}
