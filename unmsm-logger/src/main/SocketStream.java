package main;

public class SocketStream implements AbstractStream{

	@Override
	public void escribirStream(String s) {
		System.out.println("Socket Log> "+s);
		
	}

}
