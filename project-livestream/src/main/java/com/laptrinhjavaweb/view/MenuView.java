package com.laptrinhjavaweb.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.laptrinhjavaweb.controller.CustomerController;
import com.laptrinhjavaweb.entity.CustomerEntity;
import com.laptrinhjavaweb.utils.HibernateUtils;

public class MenuView {
	
	private static CustomerController customerController = new CustomerController();
    
	public static void main(String[] args) {
		campaign();
	}
	
	private static void campaign() {
		String headerMain = "** Chiến dịch khuyến mãi **";
		String[] options = {
	    		"1- Gửi email thông báo ",
	            "2- Cấu hình popup ",
	            "3- Quản lý nội dung khuyến mãi ",
	            "4- Dừng chương trình"
	    };
		boolean status = true;
		while (status) {
			printMenu(options, headerMain);
			Scanner scanner = new Scanner(System.in);
			try {
				int option = scanner.nextInt();
		        switch (option) {
		        	case 1: sentEmail();
		        		break;
		        	case 2: System.out.print("test 2"); 
		        		break;
		        	case 3: System.out.print("test 3"); 
						break;
		        	case 4: System.out.print("Chương trình kết thúc");
		        		status = false;
						break;	
		        }
			} catch (Exception e) {
				System.out.println("- Chú ý: nhập đúng định dạng nhé");
				scanner.next();
			}
		}
	}
	
	private static void sentEmail() {
		String headerMain = "** Gửi email thông báo **";
		String[] options = {
				"1- Hiển thị danh sách khách hàng ",
	    		"2- Tạo nhóm gửi chiến dịch ",
	    		"3- Gửi email ",
	    		"4- Trở lại màn hình dashboard ",
	    };
		boolean status = true;
		while (status) {
			printMenu(options, headerMain);
			Scanner scanner = new Scanner(System.in);
			try {
				int option = scanner.nextInt();
		        switch (option) {
		        	case 1: customerController.findAll();
		        		break;
		        	case 2: System.out.print("test 2"); 
		        		break;
		        	case 3: System.out.print("test 3"); 
						break;
		        	case 4: campaign();
		        		status = false;
						break;	
		        }
			} catch (Exception e) {
				System.out.println("- Chú ý: nhập đúng định dạng nhé");
				scanner.next();
			}
		}
	}

	public static void printMenu(String[] options, String header){
		System.out.println("-------------------------");
		System.out.println(header);
		for (String option : options){
            System.out.println(option);
        }
        System.out.print("Em chọn đi : ");
    }
}
