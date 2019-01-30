package com.example.demo;

public class Singleton {
	private static Singleton singleton;
	
	private static String name;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Singleton.name = name;
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
			System.err.println(" Object is Created");
			singleton.setName("Venkatesh");
		} else {
			System.err.println(" Object is Already Created");
		}
		return singleton;
	}

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		System.err.println("  get "+singleton1.getName());
		Singleton singleton2 = Singleton.getInstance();
		
		System.err.println("  get 2 "+singleton2.getName());

	}

}
