package back.coding.test;

import java.util.Scanner;

/*
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, 
X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.*/

public class Practice_01 {

	public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in); //
	 System.out.println("케이스 숫자 입력");
	 int num = scan.nextInt();
	 scan.nextLine();
	 String quest = null;
	 int y= 0;
	 int x= 0;
	 int z = 0;
	 int result = 0;
	 
	 if(num != 0) {
		 for(y=0; y<num; y++) {
			 System.out.println(y+1+"번째 문자열 문제 입력 (대문자 O와 X만 입력)"); 
			     result=0;
			     z=0;
				 quest = scan.nextLine();
			 
			 for(x=0; x<quest.length(); x++) {
				 if(quest.charAt(x) == 'X' ) {
					 z=0;
				 }else if(quest.charAt(x) =='O') {
					 result += 1+z;
					 z+=1;
				 }
			 }// 이중 for문	
			 System.out.println("결과값"+result);
		 }// 첫번째 for문
	 }//if 절
   }
}
	

