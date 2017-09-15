package calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		System.out.println("반복횟수를 입력하세요.");
		int repeat = new Scanner(System.in).nextInt();
		System.out.println("월을 입력하세요.");
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < repeat; i++) {
			int inputMonth= new Scanner(System.in).nextInt();
			list.add(inputMonth);
		}
		
		for(int i = 0; i < repeat; i++) {
			System.out.printf("%d월은 %d일까지 있습니다.%n", list.get(i), getMonthMaxDay(list.get(i).intValue()));
		}
		System.exit(0);
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
