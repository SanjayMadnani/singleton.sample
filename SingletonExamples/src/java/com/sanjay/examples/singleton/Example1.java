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

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Holds single instance of a base class.
 * 
 * @author SANJAY
 * @see Windows
 * @see Linux
 */
public abstract class Example1 {
	private static Example1 example1 = null;

	/**
	 * constructor.
	 */
	Example1() {
		super();
	}

	/**
	 * As per the Operating system creates a instance of base class. Example: If operating system is Windows then Object will hold Windows class
	 * Instance.
	 * 
	 * @return Example1 instance
	 */
	public synchronized static Example1 getDefaultInstance() {
		if (example1 == null) {
			String osName = System.getProperty("os.name");
			if (osName.startsWith("Windows")) {
				example1 = new Windows();
			} else if (osName.startsWith("Linux")) {
				example1 = new Linux();
			}
		}
		return example1;
	}

	/**
	 * Abstract method. Implemented in Linux and Windows class.
	 * 
	 * @param file
	 *            : file to create a copy in default directory as per Operating system.
	 * @return boolean: status of copy.
	 * @throws IOException
	 */
	public abstract boolean keepFileInDefaultDir(File file) throws IOException;

	/**
	 * Get's all file from a directory as per Operating system.
	 * 
	 * @return List: fileList
	 */
	public abstract List<File> getAllFilesFromDefaultDir();

	// TODO Delete
	public static void main(String[] args) {
		Example1 w = Example1.getDefaultInstance();
		System.out.println(w);
		System.out.println(System.getProperty("os.name"));
	}
}
