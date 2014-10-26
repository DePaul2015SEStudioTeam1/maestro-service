/**
 * 
 */
package edu.depaul.maestro.service;

import edu.depaul.operations.model.Container;

/**
 * Concrete implementation of the OperationsService
 * 
 * @author Paul A. Trzyna
 */
public class MaestroServiceImpl implements MaestroService {
    
    private OperationsService OperationsService;
    
    public void setOperationsService(OperationsService operationsService){
        this.OperationsService = operationsService;
    }

	/* (non-Javadoc)
	 * @see edu.depaul.service.OperationsService#store(edu.depaul.model.Container)
	 */
	public void store(Container container) {
        operationsService.store(container);

	}

}
