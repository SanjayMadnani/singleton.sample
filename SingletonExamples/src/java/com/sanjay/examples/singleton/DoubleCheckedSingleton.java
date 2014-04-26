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
 * Thread Safe Double Checked Locking Lazy Initialization Singleton.
 * 
 * @author SANJAY
 */
public class DoubleCheckedSingleton {
	private static volatile DoubleCheckedSingleton instance;

	/**
	 * Constructor: Outside the class object Creation restriction.
	 */
	private DoubleCheckedSingleton() {

	}

	/**
	 * Double checked locking concept used so that in case of multithreading environment also it will return single object all the time.
	 * 
	 * @return DoubleCheckedSingleton instance.
	 */
	public static DoubleCheckedSingleton getDefaultInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedSingleton();
				}
			}
		}
		return instance;
	}

}
