package launch;

import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class browser {

	public static void main(String[] args) {

		
		WebDriverManagerException.chromedriver().setup();
		webdriver driver = new chrome driver();
	}

}
