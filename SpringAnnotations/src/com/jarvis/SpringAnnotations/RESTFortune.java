package com.jarvis.SpringAnnotations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("REST")
public class RESTFortune implements FortuneService {
	
	private String fileName = "B:\\Workspace\\SpringAnnotations\\src\\fortune-data.txt";
	private Random myrandom = new Random();	
	ArrayList<String> arr = new ArrayList<>();
	RESTFortune(){
		System.out.println("constructor");
	
	}	
	@PostConstruct
	private void loadFile() {
		try (Scanner sc = new Scanner(new File(fileName))){		
			while(sc.hasNextLine()) {			
				arr.add(sc.nextLine());
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String getFortune() {		
		int index = myrandom.nextInt(arr.size());
		
		String fortuneteller = arr.get(index);
		return fortuneteller;
	}

}
