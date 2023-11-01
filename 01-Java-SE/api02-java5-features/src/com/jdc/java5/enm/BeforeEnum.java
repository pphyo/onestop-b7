package com.jdc.java5.enm;

public class BeforeEnum {
	
	public static final int SUN = 1;
	public static final int MON = 2;
	public static final int TUE = 3;
	public static final int WED = 4;
	public static final int THU = 5;
	public static final int FRI = 6;
	public static final int SAT = 7;
	
	public static void main(String... doYourSelf) {
		var app = new BeforeEnum();
		System.out.println(app.showDay(MON));
	}
	
	public String showDay(int day) {
		return switch(day) {
			case 2: case 3: case 4: case 5: case 6:
				yield "weekdays";
			case 1: case 7:
				yield "weekend";
			default:
				yield "Wrong Code";
		};
	}

}
