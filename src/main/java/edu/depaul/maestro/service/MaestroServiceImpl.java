/**
 * 
 */
package edu.depaul.maestro.service;

import edu.depaul.operations.model.Container;
import edu.depaul.operations.service.OperationsService;
<<<<<<< HEAD
import org.apache.log4j.Logger;
=======
>>>>>>> FETCH_HEAD

/**
 * Concrete implementation of the OperationsService
 * 
 * @author John Plante
 */
public class MaestroServiceImpl implements MaestroService<Container> {
    
    private OperationsService<Container> operationsService;
<<<<<<< HEAD
    final Logger logger = Logger.getLogger(MaestroServiceImpl.class);
=======
>>>>>>> FETCH_HEAD
    
    public void setOperationsService(OperationsService<Container> operationsService){
        this.operationsService = operationsService;
    }

	/* (non-Javadoc)
	 * @see edu.depaul.service.OperationsService#store(edu.depaul.model.Container)
	 */
	public void store(Container container) {
<<<<<<< HEAD
        
		if(logger.isDebugEnabled()){
			logger.debug("Container received by Maestro. Container ID: " + container.getId() +
					" Sent by Agent ID: " + container.getAgentId());
		}
		
		logger.error("There was a problem with the container received.", new Exception("Testing"));
		
		operationsService.store(container);        
        
=======
        operationsService.store(container);
>>>>>>> FETCH_HEAD
	}

}
