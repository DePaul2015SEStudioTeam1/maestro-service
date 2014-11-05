/**
 * 
 */
package edu.depaul.maestro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import djohn.microservices.agent.Agent;
import edu.depaul.maestro.service.MaestroService;
import edu.depaul.operations.model.Container;

/**
 * @author ptrzyna
 */
public class ServiceIntegrationTest {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/maestro-client.xml");
		MaestroService<Container> service = context.getBean("remoteMaestroService", MaestroService.class);
		
		Agent agent = new Agent();
		
		while(true) {
			Container container = agent.getContainer();
			service.store(container);
			Thread.sleep(3000);
		}
	}
	
}
