package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		
		
		Scanner sc100 = new Scanner(System.in);
		System.out.print("점수를입력하세요.(0~100점): ");
		
		
		// 참조 변수  . 메서드명 
		//nextInt() :콘솔에서 입력받은 정수를 읽어드임
		int score = sc100.nextInt();
		//int score = 40;
		char grade=' ';
		
		//||:논리합:or(또는)=>양쏙모두 거짓을때
		//%%:논리곱:and =>양쪽 모두 참일때 참
		if((score > 100)|| (score < 0)) { 
			System.out.println(score +"은 잘못된 점수입니다.");
		}
		else {
		
			if(score >= 90) {
				grade='A';
			}
			else if(score >= 80){
				grade='B';
			}
			else if(score >= 70){
				grade='C';
			}
			else if(score >= 60){
				grade='D';
			}
			else {
				grade='F';
			}
			
			System.out.println("점수:"+ score + "학점:" + grade);
		}			
	
	}
}
	
	
	

