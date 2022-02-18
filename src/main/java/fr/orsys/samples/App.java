package fr.orsys.samples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger();

	public String sayHello() {
		return "ok";
	}
	
    public static void main( String[] args )
    {
        logger.info( "Hello World!" );
    }
}

