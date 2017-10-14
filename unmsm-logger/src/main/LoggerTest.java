package main;

public class LoggerTest {
	
	public static void main(String[] args) {
		AbstractLoggerFactory factory = new LoggerFactory();	
		
		AbstractLogger logger = factory.crearLogger(StreamEnum.FILE);
		logger.registrarLog();
		
		logger = factory.crearLogger(StreamEnum.DATABASE);
		logger.registrarLog();
		
		logger = factory.crearLogger(StreamEnum.NETWORK);
		logger.registrarLog();
		
	}
}
