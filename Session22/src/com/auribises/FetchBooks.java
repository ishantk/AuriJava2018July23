package com.auribises;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class FetchBooks {

	public static void main(String[] args) {
		System.out.println("==App Started===");
		
		StringBuilder response = new StringBuilder();
		
		Date date1 = new Date();
		System.out.println("App Started at : "+date1);
		
		// H.W. : JSON Parsing in Java - Google it up !!
		
		// Task
		try{
			String url = "http://www.json-generator.com/api/json/get/chQLxhBjaW?indent=2";
			URL booksUrl = new URL(url);
		
			// Send a Request to the Server
			URLConnection connection = booksUrl.openConnection();
			
			// Response from Server
			InputStream inputStream = connection.getInputStream();
			InputStreamReader reader = new InputStreamReader(inputStream);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			while((line = buffer.readLine()) != null){
				response.append(line+"\n");
			}
			
			System.out.println("Response from Server: "+response);
			
		}catch(Exception e){
			System.out.println("Some Error: "+e);
		}
		
		Date date2 = new Date();
		System.out.println("App Ended at : "+date2);
		
		System.out.println("==App Finished===");
	}

}
