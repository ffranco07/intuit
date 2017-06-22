package com.intuit.tv;

import java.util.Map;
import java.util.HashMap;

/**
 * 
 * @author Francisco Franco
 *
 */

public final class DomainConstants {
	// Television version id and date constants
	public static final String RELEASE_ID = "1.0.0";
	public static final String RELEASE_DATE = "2017-06-21"; // YYYY-MM-DD

	// Channel number constants
	public static final String CH_2 = "2";
	public static final String CH_3 = "3";
	public static final String CH_4 = "4";
	public static final String CH_5 = "5";
	public static final String CH_6 = "6";
	public static final String CH_7 = "7";
	public static final String CH_8 = "8";
	public static final String CH_9 = "9";
	public static final String CH_10 = "10";
	public static final String CH_11 = "11";

	// Channel name constants
	public static final String KCBS_CBS = "KCBS-CBS";
	public static final String GOVERNMENT_ACCESS = "Government Access";
	public static final String KNBC_NBC = "KNBC-NBC";
	public static final String KTLA_THE_CW = "KTLA-The CW";
	public static final String KDOC_IND = "KDOC-IND";
	public static final String KABC_ABC = "KABC-ABC";
	public static final String WGN_AMERICA = "WGN America";
	public static final String KCAL_IND = "KCAL-IND";
	public static final String ANIMAL_PLANET = "Animal Planet";
	public static final String KTTV_FOX = "KTTV-FOX";
	
	// Map constants
	public static final Map<String, String> channelMap;

	static {
		channelMap = new HashMap<String, String>();
		channelMap.put(CH_2, KCBS_CBS);
		channelMap.put(CH_3, GOVERNMENT_ACCESS);
		channelMap.put(CH_4, KNBC_NBC);
		channelMap.put(CH_5, KTLA_THE_CW);
		channelMap.put(CH_6, KDOC_IND);
		channelMap.put(CH_7, KABC_ABC);
		channelMap.put(CH_8, WGN_AMERICA);
		channelMap.put(CH_9, KCAL_IND);
		channelMap.put(CH_10, ANIMAL_PLANET);
		channelMap.put(CH_11, KTTV_FOX);
	}
}
