package main;

public class FileLogger implements AbstractLogger {
	
	private FileStream stream;
	
	public FileLogger() {
		this.stream = new FileStream ();
	}
	
	@Override
	public void registrarLog() {		
		stream.escribirStream("file file file");
	}

}
