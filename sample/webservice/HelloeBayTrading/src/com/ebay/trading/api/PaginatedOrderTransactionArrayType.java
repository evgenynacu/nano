// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains a paginated list of orders.
 * 
 */
public class PaginatedOrderTransactionArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "OrderTransactionArray")
	@Order(value=0)
	public OrderTransactionArrayType orderTransactionArray;	
	
	@Element(name = "PaginationResult")
	@Order(value=1)
	public PaginationResultType paginationResult;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}