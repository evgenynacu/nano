// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Identifies a Giving Works listing and benefiting nonprofit charity organization.
 * Currently supported through the US and eBay Motors sites only. The Ad Format and
 * Mature Audiences categories are not supported.
 * Not applicable for US eBay Motors, international, Real Estate, and Tickets.
 * 
 */
public class CharityType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CharityID")
	public String charityID;	
	
	@Element(name = "CharityName")
	public String charityName;	
	
	@Element(name = "CharityNumber")
	public Integer charityNumber;	
	
	@Element(name = "DonationPercent")
	public Float donationPercent;	
	
	@Element(name = "Mission")
	public String mission;	
	
	@Element(name = "LogoURL")
	public String logoURL;	
	
	@Element(name = "CharityListing")
	public Boolean charityListing;	
	
	@Element(name = "Status")
	public CharityStatusCodeType status;	
	
	@AnyElement
	public List<Object> any;	
	
    
}