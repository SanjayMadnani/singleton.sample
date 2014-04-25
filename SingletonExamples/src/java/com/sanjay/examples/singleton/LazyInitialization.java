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

/**
 * Creates single instance of LazyInitialization class once required only.
 * 
 * @author SANJAY
 */
public class LazyInitialization {
	private static volatile LazyInitialization instance = null;

	/**
	 * Constructor: Outside the class restriction for object creation.
	 */
	private LazyInitialization() {

	}

	/**
	 * If multiple thread are calling in single time then singleton violation may occur.
	 * 
	 * @return LazyInitialization instance : Single instance all time.
	 */
	public static LazyInitialization getDefaultInstance() {
		if (instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}

}
