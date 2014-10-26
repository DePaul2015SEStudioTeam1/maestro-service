/**
 * 
 */
package edu.depaul.maestro.service;

import edu.depaul.operations.model.Container;
import edu.depaul.operations.service.OperationsService;

/**
 * Concrete implementation of the OperationsService
 * 
 * @author Paul A. Trzyna
 */
public class MaestroServiceImpl implements MaestroService<Container> {
    
    private OperationsService<Container> operationsService;
    
    public void setOperationsService(OperationsService<Container> operationsService){
        this.operationsService = operationsService;
    }

	/* (non-Javadoc)
	 * @see edu.depaul.service.OperationsService#store(edu.depaul.model.Container)
	 */
	public void store(Container container) {
        operationsService.store(container);
	}

}
