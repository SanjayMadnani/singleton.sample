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
package com.sanjay.singleton.examples;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sanjay.examples.singleton.Example1;
import com.sanjay.examples.singleton.Windows;

/**
 * JUnit test case for testing Example1 Class
 * 
 * @author SANJAY
 * @see Example1
 */
public class Example1Test {
	Example1 example;
	File file;

	/**
	 * Creates default instance of Example1 class as per Operating system.
	 * 
	 * @throws java.lang.Exception.
	 */
	@Before
	public void setUp() throws Exception {
		example = Example1.getDefaultInstance();
		assertTrue(example instanceof Windows);

		file = new File("src//test//resources//MyFile.txt");
		assertTrue(file.exists());
	}

	/**
	 * Test method for {@link com.sanjay.examples.singleton.Example1#keepFileInDefaultDir(java.io.File)}.
	 * 
	 * @throws java.lang.Exception.
	 */
	@Test
	public void testKeepFileInDefaultDir() throws Exception {
		assertTrue(example.keepFileInDefaultDir(file));
	}

	/**
	 * Test method for {@link com.sanjay.examples.singleton.Example1#getAllFilesFromDefaultDir()}.
	 */
	@Test
	public void testGetAllFilesFromDefaultDir() {
		List<File> fileList = example.getAllFilesFromDefaultDir();
		if (fileList == null) {
			System.out.println("No file exist in default directory");
		} else {
			boolean flag = false;
			for (File myFile : fileList) {
				System.out.println(myFile);
				if (myFile.getName().equals(file.getName())) {
					flag = true;
				}
			}
			assertTrue(flag);
		}
	}

}
