// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns an array of order line item (transaction) data for the item specified in the request.
 * The results can be used to create a report of data that is commonly
 * necessary for order processing.
 * Zero, one, or many <b>Transaction</b> objects can be returned in the <b>TransactionArray</b>.
 * The set of order line items returned is limited to those that were modified between
 * the times specified in the request's <b>ModTimeFrom</b> and <b>ModTime</b> filters.
 * Also returns the <b>Item</b> object that spawned the order line items.
 * If pagination filters were specified in the request, returns meta-data describing
 * the effects of those filters on the current response and the estimated effects if
 * the same filters are used in subsequent calls.
 * <br><br>
 * Data from the <b>TransactionArray</b> may be used to trigger the following Platform
 * Notifications: EndOfAuction, AuctionCheckoutComplete, FixedPriceEndOfTransaction,
 * CheckoutBuyerRequestTotal, FixedPriceTransaction, Checkout,
 * FixedPriceTransactionForSeller, FixedPriceTransactionForBuyer, ItemMarkedAsShipped,
 * and ItemMarkedAsPaid. Each notification will be based on the state of the item
 * (a 'snapshot' of the item) at the time the order line item was created.
 * 
 */
@RootElement(name = "GetItemTransactionsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemTransactionsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PaginationResult")
	@Order(value=0)
	public PaginationResultType paginationResult;	
	
	@Element(name = "HasMoreTransactions")
	@Order(value=1)
	public Boolean hasMoreTransactions;	
	
	@Element(name = "TransactionsPerPage")
	@Order(value=2)
	public Integer transactionsPerPage;	
	
	@Element(name = "PageNumber")
	@Order(value=3)
	public Integer pageNumber;	
	
	@Element(name = "ReturnedTransactionCountActual")
	@Order(value=4)
	public Integer returnedTransactionCountActual;	
	
	@Element(name = "Item")
	@Order(value=5)
	public ItemType item;	
	
	@Element(name = "TransactionArray")
	@Order(value=6)
	public TransactionArrayType transactionArray;	
	
	@Element(name = "PayPalPreferred")
	@Order(value=7)
	public Boolean payPalPreferred;	
	
    
}