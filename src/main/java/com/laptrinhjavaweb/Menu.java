package com.laptrinhjavaweb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
	public static void main(String[] args) {
		displayMenu();
	}
	
	private static void displayMenu() {
		String headerMain = "** Dashboard **";
		String[] options = {
	    		"1- Thêm sản phẩm",
	            "2- Danh sách sản phẩm",
	            "3- Exit"
	    };
		List<Product> products = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int option = 1;
		boolean status = true;
		while (status) {
			printMenu(options, headerMain);
			try {
				option = scanner.nextInt();
				switch (option) {
		        	case 1: addProduct(products);
		        		break;
		        	case 2: showProduct(products);  
		        		break;
		        	case 3: status = false; 
						break;
		        }
			} catch (Exception e) {
				System.out.println("** Nhập đúng định dạng nhé **");
				scanner.next();
			}
		}
        scanner.close();
	}

	private static void addProduct(List<Product> products) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập loại sản phẩm: ");
        String category = scanner.nextLine();
        products.add(new Product(name, category));
	}
	
	private static void showProduct(List<Product> products) {
		for (Product item: products) {
			System.out.println("Tên sản phẩm: "+item.getName()+", Loại sản phẩm: "+item.getCategory()+"");
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
