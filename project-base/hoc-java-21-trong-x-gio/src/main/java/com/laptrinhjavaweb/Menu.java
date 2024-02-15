package com.laptrinhjavaweb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String headerMain = "** Dashboard **";
		String[] options = {
	    		"1. Thêm sản phẩm",
	            "2. Danh sách sản phẩm",
	            "3. Exit"
	    };
		List<Product> products = new ArrayList<>();
		boolean status = true;
		while (status) {
			printMenu(options, headerMain);
			try {
				int option = scanner.nextInt();
				switch (option) {
		        	case 1: addProduct(products);
		        		break;
		        	case 2: showProduct(products);  
		        		break;
		        	case 3: 
		        		System.out.println("Chương trình kết thúc, tạm biệt hẹn gặp lại nhé");
		        		status = false; 
						break;
		        }
			} catch (Exception e) {
				System.out.println("- Chú ý: Nhập đúng định dạng nhé!");
				scanner.next();
			}
		}
	}
	
	private static void addProduct(List<Product> products) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("- Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("- Nhập loại sản phẩm: ");
        String category = scanner.nextLine();
        products.add(new Product(name, category));
	}
	
	private static void showProduct(List<Product> products) {
		for (Product item: products) {
			System.out.println("- Tên sản phẩm: "+item.getName()+", Loại sản phẩm: "+item.getCategory()+"");
		}
	}

	public static void printMenu(String[] options, String header){
		System.out.println("-------------------------");
		System.out.println(header);
		for (String option : options){
            System.out.println(option);
        }
        System.out.print("Nhập lựa chọn : ");
    }
}
