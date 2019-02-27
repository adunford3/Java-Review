package com.Dunford;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) throws Exception{
		gradeOutput(args[0], args[1]);
	}

	private static void gradeOutput(String filename, String bins) throws FileNotFoundException{
		int size = Integer.parseInt(bins);
		String[] arr = new String[size];
		try (Scanner gradeFile = new Scanner(new File(filename))){
			while (gradeFile.hasNext()) {
				String line = gradeFile.nextLine();
			}
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}

	}
}
