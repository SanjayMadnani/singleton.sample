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
 * Thread safe Lazy initialize singleton class.
 * 
 * @author SANJAY
 */
public class ThreadSafeSingleton {
	private static volatile ThreadSafeSingleton instance; 

	/**
	 * private Constructor restrict the object creation outside the class.
	 */
	private ThreadSafeSingleton() {

	}

	/**
	 * Returns singleton object in every situation (in multiple threads calling as well).
	 * 
	 * @return ThreadSafeSingleton instance singleton.
	 */
	public static synchronized ThreadSafeSingleton getDefaultInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
