package main;

public class DatabaseLogger implements AbstractLogger {

	private DatabaseStream stream;
	
	public DatabaseLogger() {
		this.stream = new DatabaseStream ();
	}

	@Override
	public void registrarLog() {
		stream.escribirStream("data data data");
		
	}

}
