package main;

public class DatabaseStream implements AbstractStream{

	@Override
	public void escribirStream(String s) {
		System.out.println("Database Log> "+s);
		
	}

}
