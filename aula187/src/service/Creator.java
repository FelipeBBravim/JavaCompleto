package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import entities.Product;

public class Creator {
	
	private String path;
	private String in;
	
	public Creator(String path) {
		this.path = path;
		in = "/entry.csv";
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public void read(List<Product> list) throws IOException {
		File path = new File(this.path + in);
		
		BufferedReader br= new BufferedReader(new FileReader(path));
			
		String line = br.readLine();
		for(int i=0;line != null;i++) {
			list.add(new Product(line));
			list.get(i).toProduct();
			line = br.readLine();
		}
		
		br.close();
	}
	
	public void write(List<Product> list) throws IOException {
		File path = new File(this.path + "/out/summary.csv");
		
		boolean dir = new File(this.path + "/out").mkdir();
		boolean file = new File(this.path + "/out/summary.csv").createNewFile();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			
		for(Product p : list) {
			bw.write(p.toString());
			bw.newLine();
		}
		
		bw.close();
	}
	
	public String toString() {
		return path;
	}
	

}
