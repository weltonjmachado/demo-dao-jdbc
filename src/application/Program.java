package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*Programa para operações com Seller
		System.out.println("=== Test 1: seller findById =====");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: seller findByDepartment =====");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj: list) {
			System.err.println(obj);
		}
		
		System.out.println("\n=== Test 3: seller findAll =====");
		
		list = sellerDao.findAll();
		
		for(Seller obj: list) {
			System.err.println(obj);
		}
		
		System.out.println("\n=== Test 4: seller Insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = " +newSeller.getId());
		
		System.out.println("\n=== Test 5: seller Update =====");
		seller = sellerDao.findById(1);
		seller.setEmail("martha@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n=== Test 6: seller Delete =====");
		System.out.printf("Enter Id for delete Test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Completed");*/
		// -------------------------------------------------------------------------------------------
		//Programa para operações com Department
		
		System.out.println("=== Test 1: department findById =====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== Test 2: department update =====");
		
		List<Department> list = new ArrayList<>();
		
		list = departmentDao.findAll();
		
		for(Department dep: list) {
			System.err.println(dep);
		}
		
		/*System.out.println("\n=== Test 3: department Insert =====");
		Department newDepartment = new Department(null,"D3");
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! New Id: " + newDepartment.getId());*/
		
		System.out.println("\n=== Test 4: department update =====");
			department = departmentDao.findById(8);
			department.setName("Fashion");
			departmentDao.update(department);
			System.out.println("Updated complete!");
			
		System.out.println("\n=== Test 5: delete department=====");
		
		/*System.out.printf("Enter Id for delete Test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed");*/
		
		
		sc.close();
		
		
	}
}