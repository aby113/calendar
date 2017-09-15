package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("---------------------------");
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		System.out.println("원하는 달을 입력하세요");
		int inputMonth = new Scanner(System.in).nextInt();
		int[] maxMonDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

//		System.out.printf("해당 %d 달 최대 일수는 %d 입니다", inputMonth, maxMonDay[inputMonth - 1]);
		System.out.printf("해당 %d 월 최대 일수는 %d일 입니다", inputMonth, getMonthMaxDay(inputMonth));

	}

	public static int getMonthMaxDay(int i) {
		int maxDay = 0;
		switch(i){
		case 4:
		case 6:
		case 9:
		case 11:
			maxDay = 30;
			break;
		case 2:
			maxDay = 28;
			break;
		default:
			maxDay = 31;
		}
		return maxDay;
	}

}
