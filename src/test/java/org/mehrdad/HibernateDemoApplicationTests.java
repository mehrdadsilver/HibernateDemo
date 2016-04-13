package org.mehrdad;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import org.mehrdad.Address;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HibernateDemoApplication.class)
@WebAppConfiguration
public class HibernateDemoApplicationTests {

	@Test
	public void contextLoads() {
		
		//Address add = Address.().block("4").city("Tehran").postalCode("34325344").build();
		//System.out.println(add.toString());
	}

}
