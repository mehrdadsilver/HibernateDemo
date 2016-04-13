package org.mehrdad;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HibernateDemoApplication {

	@Autowired
	UserRepository userRep;
	
	
	@Autowired
	MyConfig config;
	
	@RequestMapping("/")
	public String TestController()
	{
		//LOGGER.error("DFdfwsfewrerwer");
		
		User user =new User();
    	user.setFirstName("Test");
    	user.setLastName("User");
    	user.setAge(55);
//    	
    	//Veichle vecivhle = new Veichle("5","mazda","44g343",44);
    	
    	FourWheelVeichle veichle = new FourWheelVeichle("7", "Honda", "434dfd", 55);
    	veichle.setSteeringWheel("Fast");
    	user.getVeichle().add(veichle);
    	veichle.setUser(user);
    	
    	TwoWheelVeichle vecivhle2 = new TwoWheelVeichle("6","Nissan","34g443",33);
    	vecivhle2.setWheelHandle("Handle Yamaha");
    	user.getVeichle().add(vecivhle2);
    	vecivhle2.setUser(user);

    	
    	
//    	
    	userRep.save(user);
//    	
//    	user.setFirstName("Test2");
//    	
//    	System.out.println("###" + userRep.findWithHQL());
//    	
//    	System.out.println("@@@" + userRep.finaHame());
//		
//		System.out.println("%%% " + config.getServers());

    	
    	user.setFirstName("NMND");		
    	
		return "OK";
	}
	
    private static final Logger LOGGER = LoggerFactory.getLogger(HibernateDemoApplication.class);

    public static void main(String[] args) {
    	
    	
    	
        SpringApplication.run(HibernateDemoApplication.class, args);
        
    }
}
