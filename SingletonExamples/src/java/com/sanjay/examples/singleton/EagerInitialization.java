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
 * Creates single instance of EagerInitialization class at class loading time.
 * 
 * @author SANJAY
 */
public class EagerInitialization {
	/**
	 * Eager Initialization of Object.
	 */
	private static final EagerInitialization INSTANCE = new EagerInitialization();

	/**
	 * Constructor: Outside the class restriction for object creation.
	 */
	private EagerInitialization() {

	}

	/**
	 * @return EagerInitialization INSTANCE : single instance all time.
	 */
	public static EagerInitialization getDefaultInstance() {
		return INSTANCE;
	}

}
