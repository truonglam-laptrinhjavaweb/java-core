package com.laptrinhjavaweb.view;

import java.util.Scanner;

public class MenuView {
	
	public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Em chọn đi : ");
    }
	
    private static String[] options = {
    		"1- Gửi email thông báo ",
            "2- Cấu hình popup ",
            "3- Quản lý nội dung khuyến mãi"
    };
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=4){
            printMenu(options);
            option = scanner.nextInt();
            switch (option){
                case 1: System.out.print("test 1");
                		break;
                case 2: System.out.print("test 2"); 
                		break;
                case 3: System.out.print("test 3"); 
        				break;
            }
        }
	}
}
