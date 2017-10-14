package main;

public class FileStream implements AbstractStream{

	@Override
	public void escribirStream(String s) {
		System.out.println("File Log> "+s);
		
	}

}
