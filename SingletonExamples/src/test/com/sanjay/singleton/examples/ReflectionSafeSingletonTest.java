/*
 * Copyright (C) 2014, 2015 Sanjay Madnani
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

import com.sanjay.examples.singleton.ReflectionSafeSingleton;

/**
 * JUnit test case for testing ReflectionSafeSingleton enum.
 * 
 * @author SANJAY
 * @see ReflectionSafeSingleton
 */
public class ReflectionSafeSingletonTest {

	/**
	 * Check for singleton. 
	 */
	@Test
	public void testInstance() {
		int hashCode = 0;
		for (ReflectionSafeSingleton single : ReflectionSafeSingleton.values()) {
			hashCode = single.hashCode();
		}
		assertEquals(hashCode, ReflectionSafeSingleton.SINGLE_INSTANCE.hashCode());
		ReflectionSafeSingleton.SINGLE_INSTANCE.sayHello();
	}
}
