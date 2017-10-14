package main;

public class LoggerTest {
	
	public static void main(String[] args) {
		AbstractLoggerFactory factory = new LoggerFactory();
		AbstractLogger logger = factory.crearLogger(new FileStream());
		logger.registrarLog();
		
		logger = factory.crearLogger(new DatabaseStream());
		logger.registrarLog();
		
		logger = factory.crearLogger(new SocketStream());
		logger.registrarLog();
		
	}
}
