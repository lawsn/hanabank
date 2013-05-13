package mytest;

import java.util.Calendar;
import java.util.Random;

public class TempTest {

	public static void main(String[] args) {
		Calendar cld = Calendar.getInstance();
		
		cld.set(2010, 0, 1, 0, 0, 0);
		
		long next = 24 * 60 * 60 * 1000;
		
		for(int i=0; i<365; i++) {
			
			if(cld.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
				&& cld.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
			{
			
				String amt = amount(true);
				
				System.out.print(amt);
				System.out.print(" ");
				System.out.print("점심식대");
				System.out.print(" ");
				System.out.print(cld.get(Calendar.YEAR));
				System.out.print("-");
				System.out.print(cld.get(Calendar.MONTH) + 1);
				System.out.print("-");
				System.out.print(cld.get(Calendar.DATE));
				System.out.println();

				System.out.print(40 - Integer.parseInt(amt));
				System.out.print(" ");
				System.out.print("저녁식대");
				System.out.print(" ");
				System.out.print(cld.get(Calendar.YEAR));
				System.out.print("-");
				System.out.print(cld.get(Calendar.MONTH) + 1);
				System.out.print("-");
				System.out.print(cld.get(Calendar.DATE));
				System.out.println();

			}
			cld.setTimeInMillis(cld.getTimeInMillis() + next);

		}
	}

	private static Random r = new Random();
	
	public static String amount(boolean m) {
	
		int a = r.nextInt(3);
		int b = r.nextInt(10);
		
		while(true) {
			if(a == 0 && b < 8) {
				b = r.nextInt(10);
				continue;
			}
			
			break;
		}
		
		int x = (a+b * 1000) % 10;
		System.out.println(x);
		
		return String.valueOf(a) + String.valueOf(b);
	}
}
