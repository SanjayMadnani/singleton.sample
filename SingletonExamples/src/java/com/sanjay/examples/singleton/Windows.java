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
import java.util.ArrayList;
import java.util.List;

/**
 * This class will be loaded by Example1 Class if Operating system is Windows.
 * 
 * @author SANJAY
 */
final public class Windows extends Example1 {
	/**
	 * Directory to keep and retrieve files in a Windows Operation system.
	 */
	private String defaultDir = "C:\\MyFiles";

	/**
	 * default constructor for restricting object creation outside the package.
	 */
	Windows() {
		super();
	}

	/**
	 * Abstract method. copy a file in a Windows machine "defaultDir".
	 * 
	 * @param file
	 *            : file to create a copy in default directory as per Windows system.
	 * @return boolean: status of copy.
	 * @throws IOException
	 */
	@Override
	public boolean keepFileInDefaultDir(File file) throws IOException {
		File myFile = new File(defaultDir);
		myFile.mkdirs();
		myFile = new File(defaultDir, file.getName());
		return myFile.createNewFile();
	}

	/**
	 * Get's all file from a directory in windows operating system.
	 * 
	 * @return List: fileList
	 */
	@Override
	public List<File> getAllFilesFromDefaultDir() {
		List<File> fileList = new ArrayList<File>();
		File directory = new File(defaultDir);
		if (!directory.exists()) {
			return null;
		}
		File[] listOfFiles = directory.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				fileList.add(listOfFiles[i]);
			}
		}
		return fileList;
	}
}
