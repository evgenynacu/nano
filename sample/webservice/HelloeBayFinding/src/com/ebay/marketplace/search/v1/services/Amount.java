// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Monetary amount.
 * 
 */
public class Amount implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	public double value;	
	
	@Attribute  
	public String currencyId;	
	
    
}