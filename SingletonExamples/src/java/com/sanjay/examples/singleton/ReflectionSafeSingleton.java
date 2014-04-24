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
 * enum values are globally accessible, so is the singleton.
 * 
 * @author SANJAY
 */
public enum ReflectionSafeSingleton {
	/**
	 * Single instance of enum ReflectionSafeSingleton.
	 */
	SINGLE_INSTANCE;

	/**
	 * Methods same as we creates in class.
	 */
	public void sayHello() {
		System.out.println("Hello");
	}

}
