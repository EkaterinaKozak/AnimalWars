package com.animalwars.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ResultSaver {
	
	public static void saveLog(String result) {
		try (FileWriter fileWriter = new FileWriter("results.txt")) {
			try (BufferedWriter writer = new BufferedWriter(fileWriter)){
				writer.write(result);
			}
		} catch (IOException exception) {
			System.out.println("Error!");
		}
	}
}
