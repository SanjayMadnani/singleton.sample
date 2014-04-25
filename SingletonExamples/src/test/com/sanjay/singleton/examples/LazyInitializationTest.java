/*
 * Copyright (C) 2014, 2015 Sanjay Madnani.
 *
 * This file is free to use: you can redistribute it and/or modify it under the terms of the 
 * GPL General Public License V3 as published by the Free Software Foundation, subject to the following conditions:
 *                                                                                          
 * The above copyright notice should never be changed and should always included wherever this file is used.
 *                                                                                          
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY.  
 * See the GNU General Public License for more details.                                       
 *
 */
package com.sanjay.singleton.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sanjay.examples.singleton.LazyInitialization;

/**
 * Test LazyInitialization class for singleton design pattern.
 * 
 * @author SANJAY
 * @see LazyInitialization
 */
public class LazyInitializationTest {

	/**
	 * Test for singleton: should return same object all times in case of single thread. Test method for
	 * {@link com.sanjay.examples.singleton.EagerInitialization#getDefaultInstance()}.
	 */
	@Test
	public void testGetDefaultInstance() {
		assertEquals(LazyInitialization.getDefaultInstance(), LazyInitialization.getDefaultInstance());
	}

}
