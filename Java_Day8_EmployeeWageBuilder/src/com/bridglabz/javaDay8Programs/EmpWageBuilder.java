package com.bridglabz.javaDay8Programs;

import java.util.Random;

public class EmpWageBuilder {
	public static final int isFulltime = 1, isParttime = 2;
	public static int Attendance() {
		Random random = new Random();
		int check = random.nextInt(3);
		return check;
	}
}