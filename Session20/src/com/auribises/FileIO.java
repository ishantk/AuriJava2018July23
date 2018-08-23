package com.auribises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO {

	void writeInFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/quotes.txt");
			/*if(file.exists()){
				System.out.println(file.getName()+" Exists !!");
			}else{
				System.out.println(file.getName()+" does not Exists !!");
			}*/
			
			String data = "Search the candle, rather than cursing the darkness !!";
			//String data = "be Exceptional !!\n";
			
			FileOutputStream outputStream = new FileOutputStream(file,true); // true-> append mode
			outputStream.write(data.getBytes());
			outputStream.close();
			
			System.out.println("--File Written--");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void writeInFileAgain(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/myQuotes.txt");
			/*if(file.exists()){
				System.out.println(file.getName()+" Exists !!");
			}else{
				System.out.println(file.getName()+" does not Exists !!");
			}*/
			
			//String data = "Search the candle, rather than cursing the darkness !!\n";
			//String data = "be Exceptional !!\n";
			String data = "Work Hard, Get Luckier !!";
			
			FileWriter writer = new FileWriter(file,true); // true-> append mode
			writer.write(data);
			writer.close();
			
			System.out.println("--File Written--");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void readFromFile(){
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/ExcDemo.java");
			File file = new File("/Users/ishantkumar/Downloads/","ExcDemo.java");
			
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			while((i = fis.read()) != -1){
				char ch = (char)i;
				System.out.print(ch);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void readFromFileAgain(){
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/ExcDemo.java");
			File file = new File("/Users/ishantkumar/Downloads/","ExcDemo.java");
			
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line = "";
			
			while( (line = buffer.readLine()) != null){
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		FileIO io = new FileIO();
		//io.writeInFile();
		//io.writeInFileAgain();
		//io.readFromFile();
		io.readFromFileAgain();

	}

}
