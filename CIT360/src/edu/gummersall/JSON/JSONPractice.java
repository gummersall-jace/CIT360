package edu.gummersall.JSON;

import org.json.simple.JSONObject;

public class JSONPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      JSONObject obj = new JSONObject();

	      obj.put("name", "jace");
	      obj.put("num", new Integer(450));
	      obj.put("balance", new Double(123.21));
	      obj.put("is_vip", new Boolean(true));

	      System.out.println(obj);
    }
}


