package com.bridglabz.javaDay8Programs;

import java.util.Random;

public class EmpWageBuilder {
	public static final int WagePerHr = 20, FullDayHr = 8, PartThimeHr = 4;
	public static final int isFulltime = 1, isParttime = 2;
	public static int cnt = 0;
	
	public static int Attendance() {
		Random random = new Random();
		int check = random.nextInt(3);
		return check;
	}
	
	public static int getDailyWager() {
		int Daily_wage = WagePerHr * FullDayHr; 
		return Daily_wage;
	}
	
	public static int getPartTimeWage() {             // adding part time wager
    	int PartTimeWage = WagePerHr * PartThimeHr; 
        return PartTimeWage;
    }
	
	public static int usingSwitch() {
		int check = Attendance() ;
		cnt++;
		switch (check) {
			case isFulltime: 
				System.out.println("Day"+cnt+" = "+getDailyWager());
				return getDailyWager();
		case isParttime:  
				System.out.println("Day"+cnt+" = "+getPartTimeWage());
				return getPartTimeWage();
			default:
				System.out.println("Day"+cnt+" = 0");
			
		return 0;
		}
	}
	
	public static void getMonthlyWage() {
		
		int TotalWage = 0;
		for(int Day = 1; Day <= 20; Day++) {
			TotalWage += usingSwitch();
		}
		System.out.println("Employee Monthly wager = "+TotalWage);
	}
}
