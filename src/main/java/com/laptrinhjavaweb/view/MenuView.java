package com.laptrinhjavaweb.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.laptrinhjavaweb.entity.CustomerEntity;
import com.laptrinhjavaweb.utils.HibernateUtils;

public class MenuView {
    
	public static void main(String[] args) {
		//campaign();
		List<CustomerEntity> customerEntities = new ArrayList<>();
		Session session = HibernateUtils.getSessionFactory().openSession();
		String sql = "FROM CustomerEntity";
		Query<CustomerEntity> query = session.createQuery(sql, CustomerEntity.class);
		customerEntities = query.getResultList();
		for (CustomerEntity customer: customerEntities) {
			System.out.println("ID: "+customer.getId()+", fullname: "+customer.getFullName()+"");
		}
	}
	
	private static void campaign() {
		String headerMain = "** Chiến dịch khuyến mãi **";
		String[] options = {
	    		"1- Gửi email thông báo ",
	            "2- Cấu hình popup ",
	            "3- Quản lý nội dung khuyến mãi"
	    };
		printMenu(options, headerMain);
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
        switch (option) {
        	case 1: sentEmail();
        		break;
        	case 2: System.out.print("test 2"); 
        		break;
        	case 3: System.out.print("test 3"); 
				break;
        }
        scanner.close();
	}
	
	private static void sentEmail() {
		String headerMain = "** Gửi email thông báo **";
		String[] options = {
	    		"1- Tạo nhóm gửi chiến dịch ",
	    		"2- Gửi email ",
	    		"3- Trở lại màn hình khuyến mãi ",
	    };
		printMenu(options, headerMain);
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
        switch (option) {
        	case 1: System.out.print("test");;
        		break;
        	case 2: System.out.print("test");;
    			break;
        	case 3: campaign(); 
        		break;
        }
        scanner.close();
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
