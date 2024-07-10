package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDao {

	public void fileSave(String content, String fileName) {
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


	public String fileOpen(String fileName) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"))) {
			
			String value = null;
			StringBuilder sb = new StringBuilder();
			while ((value = br.readLine()) != null) {
				sb.append(value);
				sb.append("\n");
			}
			
			String result = sb.toString();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		


	
}




}