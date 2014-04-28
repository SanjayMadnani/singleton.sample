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

import java.io.Serializable;

/**
 * Serializable Singleton Class with common mistake.
 * 
 * @author SANJAY
 */
public class SerializableSingleton implements Serializable {
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	private static volatile SerializableSingleton instance;

	/**
	 * Constructor: Outside the class object Creation restriction.
	 */
	private SerializableSingleton() {

	}

	/**
	 * Double checked locking concept used so that in case of multithreading environment also it will return single object all the time.
	 * 
	 * @return SerializableSingleton instance.
	 */
	public static SerializableSingleton getDefaultInstance() {
		if (instance == null) {
			synchronized (SerializableSingleton.class) {
				if (instance == null) {
					instance = new SerializableSingleton();
				}
			}
		}
		return instance;
	}
}
