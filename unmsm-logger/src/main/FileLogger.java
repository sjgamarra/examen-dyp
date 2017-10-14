package main;

public class FileLogger implements AbstractLogger {

	@Override
	public void registrarLog() {
		System.out.println("Mira mama log en fichero....");
	}

}
