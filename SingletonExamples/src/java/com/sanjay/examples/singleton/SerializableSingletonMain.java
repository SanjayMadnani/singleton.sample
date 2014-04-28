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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author SANJAY
 */
public class SerializableSingletonMain {
	/**
	 * @param args
	 * @throws Exception
	 *             instance of : IOException or FileNotFoundException or ClassNotFoundException
	 */
	public static void main(String[] args) throws Exception {
		// first instance of class.
		SerializableSingleton firstInstance = SerializableSingleton.getDefaultInstance();
		// serialize firstInstance in filename.ser file.
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("myFile.ser"));
		out.writeObject(firstInstance);
		// Close the connection.
		out.close();

		// deserialize myFile.ser file object
		ObjectInput in = new ObjectInputStream(new FileInputStream("myFile.ser"));
		SerializableSingleton secondInstance = (SerializableSingleton) in.readObject();
		// close the connection.
		in.close();

		// Check the equality of firstInstance with secondInstance(deserialized object).
		System.out.println("Both objects are equal: " + firstInstance.equals(secondInstance));
		System.out.println("instanceOne hashCode=" + firstInstance.hashCode());
		System.out.println("instanceTwo hashCode=" + secondInstance.hashCode());
	}
}
