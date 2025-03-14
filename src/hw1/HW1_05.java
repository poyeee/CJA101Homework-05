package hw1;

public class HW1_05 {
	
	public static void main(String[] args) {
		
		//• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		
		int num1 = 12;
		int num2 = 6;
		int sum1 = num1 + num2;
		int sum2 = num1*num2;
		System.out.println(sum1);
		System.out.println(sum2);
		
		
		//• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		
		int egg = 200, doz = 12;	
		int dozegg1 = (egg/doz);
		int dozegg2 = (egg%doz);		
		System.out.println(dozegg1+"打"+dozegg2+"顆");
			
		//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		int sec_tatal = 256559;
		int day = sec_tatal/3600/24;
		int sec_remain1 = sec_tatal%3600%24;
		int hour = sec_remain1/3600;
		int sec_remain2 = sec_remain1%3600;
		int min = sec_remain1/60;
		int sec_remain3 = sec_remain2%60;
		int sec = sec_remain3;
		System.out.println(day + "天" + hour + "小時" + min + "分" + sec + "秒");

		//• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		
		final double PI = 3.1415;
		double circle_area = 5*5*PI;
		double circumference = 5*2*PI;
		System.out.println(circle_area);
		System.out.println(circumference);			
			
		//• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
		//  金加利息共有多少錢 (用複利計算，公式請自行google)
		
		int deposit = 1500000;
		double total = deposit * Math.pow(1.02, 2);
		System.out.println(total + "元");	
			
		//• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		//	5 + 5
		//	5 + ‘5’
		//	5 + “5”
		//  並請用註解各別說明答案的產生原因
		
		System.out.println(5 + 5);   //字面常數 + 字面常數
		System.out.println(5 + '5'); //字面常數 + 字元字面常數(被視為unicode編碼)
		System.out.println(5 + "5"); //字面常數 串接 字符串
		
	}
}
