package ProjectLog4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestClass {
//log4 thi src r8 click then folder option click then project option click folder name
	//suppose Log4 then finish
	
	private static Logger Log=LogManager.getLogger(TestClass.class.getName());

	public static void main(String[] args) {
//suhas
		Log.debug("this is debugging");
		Log.info("tis is info");
		Log.error("this is error");
		Log.fatal("this is fatal");
		}

}
