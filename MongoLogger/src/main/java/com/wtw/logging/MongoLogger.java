package com.wtw.logging;


public final class MongoLogger
{
    /*
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    } */
	// Eager initialization
	private static final MongoLogger INSTANCE = new MongoLogger();
	
	private MongoLogger() {}
	
	public static MongoLogger getInstance() {
		return INSTANCE;
	}
	
	public static String getToday() {
		return "Today";
	}
}
