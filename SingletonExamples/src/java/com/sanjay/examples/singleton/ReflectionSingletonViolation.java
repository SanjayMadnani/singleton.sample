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
package com.sanjay.examples.singleton;

import java.lang.reflect.Constructor;

/**
 * Breaks singleton by creating more than one instance of a singleton class.
 * 
 * @author SANJAY
 * @see EagerInitialization
 */
public class ReflectionSingletonViolation {

	/**
	 * Creates two instance of EagerInitialization class by using reflection concept.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		EagerInitialization firstOb = EagerInitialization.getDefaultInstance();
		EagerInitialization secondOb = null;
		// reflection concept to get constructor of a EagerInitialization class.
		Constructor<EagerInitialization> constructor = EagerInitialization.class.getDeclaredConstructor();
		// change the accessibility of constructor for outside a class object creation.
		constructor.setAccessible(true);
		// creates object of a class as constructor is accessible now.
		secondOb = constructor.newInstance();
		// close the accessibility of a constructor.
		constructor.setAccessible(false);
		System.out.println("Both Objects are Equal:" + firstOb.equals(secondOb));
		System.out.println("hash code of firstOb: " + firstOb.hashCode());
		System.out.println("hash code of secondOb: " + secondOb.hashCode());
	}

}
