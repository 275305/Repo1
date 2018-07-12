package utilities;

import java.util.Properties;
import java.util.logging.Logger;

import com.test.fulfilment.ReusableActions;


public class Logs {

static Logger logger = Logger.getLogger("logs");
	
	public static int getLogLevel(){
		Properties pr = ReusableActions.readProperties();
		return Integer.parseInt(pr.getProperty("loglevel"));

	}
	 
	
	public static int logLevel = getLogLevel();
	
//	public static void infoLog( String message) {
//		  if (logLevel >= 4) {
//		   log( "server", "info", message);
//		  }
//		 }
//
//		 public static void debugLog( String message) {
//		  if (logLevel >= 3) {
//		   log( "server", "debug", message);
//		  }
//		 }
//
//		 public static void errorLog( String message) {
//		  if (logLevel >= 2) {
//		   log( "server", "error", message);
//		  }
//		 }
//
//		 public static void criticalLog( String message) {
//		  log( "server", "critical", message);
//		 }
//
//		 private static void log( String source, String logType, String message) {
//			  
//			 logger.logp(null, "", "",logType + ":" + message);
//			 //context.getLogger().log("source:" + source + "; " + logType + ":" + message);
//			 }
//		 
//		
	 public static void writeLog(String  logType,String message) {
		  if ((logType.equalsIgnoreCase("info") && logLevel >= 4)
		    || (logType.equalsIgnoreCase("debug") && logLevel >= 3)
		    || (logType.equalsIgnoreCase("error") && logLevel >= 2)
		    || (logType.equalsIgnoreCase("critical") && logLevel >= 1)) {
		  logger.log(null,"logType:"+logType+"message"+message);
		  }

	 }
}
