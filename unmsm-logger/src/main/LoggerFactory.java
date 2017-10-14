package main;

public class LoggerFactory implements AbstractLoggerFactory{

	@Override
	public AbstractLogger crearLogger(StreamEnum e) {
		AbstractLogger logger = null; //:O
		switch(e){
			case FILE:
				logger = new FileLogger();
				break;
			case DATABASE:
				logger = new DatabaseLogger();
				break;
			case NETWORK:
				logger = new NetworkLogger();
				break;
			default:
				break;
		}
		return logger;
	}
	
	

}
