// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>ReturnPolicyDetails.Refund</b> container that is
 * returned in <b>GeteBayDetails</b>. All of the values (along with descriptions
 * for each value) that can be used as a Refund Option when listing an item is returned
 * under the <b>ReturnPolicyDetails.Refund</b> container.
 * 
 */
public class RefundDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RefundOption")
	@Order(value=0)
	public String refundOption;	
	
	@Element(name = "Description")
	@Order(value=1)
	public String description;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}