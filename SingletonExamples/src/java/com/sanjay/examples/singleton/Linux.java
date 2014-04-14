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

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * This class will be loaded by Example1 Class if Operating system is Linux.
 * 
 * @author SANJAY
 */
final public class Linux extends Example1 {

	/**
	 * default constructor for restricting object creation outside the package.
	 */
	Linux() {
		super();
	}

	/**
	 * Abstract method. copy a file in a Linux machine directory.
	 * 
	 * @param file
	 *            : file to create a copy in default directory as per Linux system.
	 * @return boolean: status of copy.
	 * @throws IOException
	 */
	@Override
	public boolean keepFileInDefaultDir(File file) {
		// Method Implementation Logic as per Linux Machine
		return true;
	}

	/**
	 * Get's all file from a directory in a Linux Machine.
	 * 
	 * @return List: fileList
	 */
	@Override
	public List<File> getAllFilesFromDefaultDir() {
		// Method Implementation Logic as per Linux Machine
		return null;
	}

}
