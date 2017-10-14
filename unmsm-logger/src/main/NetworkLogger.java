package main;

public class NetworkLogger implements AbstractLogger {

	private SocketStream stream;
	
	public NetworkLogger() {
		this.stream = new SocketStream();
	}
	
	@Override
	public void registrarLog() {
		stream.escribirStream("net net net");
	}
}
