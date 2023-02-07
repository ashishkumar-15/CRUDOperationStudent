package com.palletech;

import java.util.Scanner;

public class RunAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 - to create table");
		System.out.println("Press 2 - to insert to table");
		System.out.println("Press 3 - to update table");
		System.out.println("press 4 - to delete table");
		System.out.println();
		System.out.println("Enter the number now");
		int number = sc.nextInt();
		All_action a = new All_action();
		switch(number)
		{
			case 1:
			{
				a.creating();
				System.out.println("Table created sucessfully");
				break;
			}
			case 2:
			{
				System.out.println("Enter the detials to insert");
				System.out.println("Enter Employee eno");
				int x = sc.nextInt();
				System.out.println("Enter Employee name");
				String y = sc.next();
				System.out.println("Enter Employee salary");
				int z = sc.nextInt();
				a.inserting(x, y, z);
				System.out.println("Details inserted sucessfully");
				break;
			}
			case 3:
			{
				System.out.println("Enter Details to update");
				System.out.println("Enter employee eno");
				int x = sc.nextInt();
				System.out.println("Enter employee name");
				String y = sc.next();
				System.out.println("Enter employee salary");
				int z = sc.nextInt();
				a.updating(x, y, z);
				System.out.println("Data updated sucesufully");
				break;
			}
			case 4:
			{
				System.out.println("Enter employee number to delete");
				int num = sc.nextInt();
				a.delete(num);
				System.out.println("Deleting of row is sucessful");
				break;
			}
		}

	}

}
