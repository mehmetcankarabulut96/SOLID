package SOLID.S.customerservice.badcode;

import java.util.logging.Logger;

public class ATMLogger {
	private static Logger logger = Logger.getLogger("ATMLogger");
	
	public ATMLogger(){
		logger = Logger.getLogger("ATMLogger");
	}
	
	public static Logger getLogger(){
		return logger;
	}
}
