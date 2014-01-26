/**
 * 
 */
package com.googlecode.jsonrpc4j;

/**
 * @author Roxana Stanciu
 * @Created 26.01.2014
 * Used for extra attributes in the json message
 *
 */
public class NonStandardAttribute {

	
	public String name;
	public String value;
	
	public NonStandardAttribute(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	
}
