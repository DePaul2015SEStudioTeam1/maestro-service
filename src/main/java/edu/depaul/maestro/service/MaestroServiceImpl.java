/**
 * 
 */
package edu.depaul.maestro.service;

import org.apache.log4j.Logger;

import edu.depaul.operations.model.Container;
import edu.depaul.operations.service.OperationsService;

/**
 * Concrete implementation of the OperationsService
 * 
 * @author John Plante
 */
public class MaestroServiceImpl implements MaestroService<Container> {
    
    private OperationsService<Container> operationsService;
    final Logger logger = Logger.getLogger(MaestroServiceImpl.class);
    
    public void setOperationsService(OperationsService<Container> operationsService){
        this.operationsService = operationsService;
    }

	/* (non-Javadoc)
	 * @see edu.depaul.service.OperationsService#store(edu.depaul.model.Container)
	 */
	public void store(Container container) {
		logger.debug("Container received. [Container: " + container.getId() + " Agent: " + container.getAgentId() + "]");
		
		try {
			operationsService.store(container);
		}
		catch(Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

}
