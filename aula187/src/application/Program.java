package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.Creator;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		String path = "/home/felipe/Documentos/Aulas/Java Completo/aula187/files";
		Creator file = new Creator(path);
		
		try {
			file.read(list);
			file.write(list);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
