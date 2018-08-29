package com.auribises;

class Table{
	
	private static Table t = new Table();
	
	private Table(){
		
	}
	
	//synchronized public void printTable(int num){ // Synchronized Method
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	public void fun(){
		System.out.println("This is fun");
	}
	
	public static Table getTable(){
		return t;
	}
}

class ThreadOne extends Thread{
		
	public void run() {
		
		Table t = Table.getTable();
		
		synchronized (t) { // Synchronized Block
			t.printTable(9);
			t.fun();
		}
		
		//Table.getTable().printTable(5);
	}
}

class ThreadTwo extends Thread{
	
	public void run() {
		
		Table t = Table.getTable();
		
		synchronized (t) {
			t.printTable(13);
		}
		
		//Table.getTable().printTable(7);
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		
		//ThreadOne tOne = new ThreadOne();
		//tOne.start();
		
		new ThreadOne().start();
		new ThreadTwo().start();

	}

}
