// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This call enables a seller to create an Unpaid Item case against a buyer, or to cancel a
 * single line item order.
 * <br/><br/>
 * <span class="tablenote"><b>Note:</b>
 * This call is only used by sellers to create an Unpaid Item cases or to mutually cancel a
 * single line item order. Buyers must use the eBay Resolution Center or PayPal Resolution
 * Center (for orders that satisfy requirements) to create an Item Not Received or an Item
 * Significantly Not as Described case.
 * </span>
 * 
 */
@RootElement(name = "AddDisputeRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddDisputeRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DisputeExplanation")
	@Order(value=0)
	public DisputeExplanationCodeType disputeExplanation;	
	
	@Element(name = "DisputeReason")
	@Order(value=1)
	public DisputeReasonCodeType disputeReason;	
	
	@Element(name = "ItemID")
	@Order(value=2)
	public String itemID;	
	
	@Element(name = "TransactionID")
	@Order(value=3)
	public String transactionID;	
	
	@Element(name = "OrderLineItemID")
	@Order(value=4)
	public String orderLineItemID;	
	
    
}