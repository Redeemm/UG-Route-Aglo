package com.group.manager;


import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.group.routeplanner.data.TransitXMLParser;


public class TransitXMLParserTest {

	TransitXMLParser reader = new TransitXMLParser();
		
	@Test
	public void testGetNetworkData_() throws IOException 
	{				
		assertTrue(reader.getNetworkData()!=null);
	}
}