package main;

public class LoggerFactory implements AbstractLoggerFactory{

	@Override
	public AbstractLogger crearLogger(AbstractStream stream) {
		AbstractLogger logger = null; //:O
		if(stream.getClass().equals(FileStream.class)){
			logger = new FileLogger();
		}
		
		if(stream.getClass().equals(DatabaseStream.class)){
			logger = new DatabaseLogger();
		}
		
		if(stream.getClass().equals(SocketStream.class)){
			logger = new NetworkLogger();
		}
		return logger;
	}

}
