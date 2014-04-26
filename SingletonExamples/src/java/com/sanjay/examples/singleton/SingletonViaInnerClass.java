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
package com.sanjay.examples.singleton;

/**
 * Best approach to create singleton class using inner class, No synchronization required.
 * 
 * @author SANJAY
 */
public class SingletonViaInnerClass {
	/**
	 * private Constructor restrict the object creation outside the class.
	 */
	private SingletonViaInnerClass() {

	}

	/**
	 * Inner class as a helper to create Instance of SingletonViaInnerClass.
	 * 
	 * @author SANJAY
	 */
	private static class SingletonHelperInnerClass {
		private static final SingletonViaInnerClass INSTANCE = new SingletonViaInnerClass();
	}

	/**
	 * Loads SingletonHelperInnerClass to create instance.
	 * 
	 * @return SingletonViaInnerClass instance.
	 */
	public static SingletonViaInnerClass getDefaultInstance() {
		return SingletonHelperInnerClass.INSTANCE;
	}
}
