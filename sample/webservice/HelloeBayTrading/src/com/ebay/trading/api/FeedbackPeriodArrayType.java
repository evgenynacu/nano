// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for a set of feedback statistics. Contains zero one or
 * multiple FeedbackPeriod objects. Output only, for the summary
 * feedback data returned by GetFeedback.
 * 
 */
public class FeedbackPeriodArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FeedbackPeriod")
	@Order(value=0)
	public List<FeedbackPeriodType> feedbackPeriod;	
	
    
}