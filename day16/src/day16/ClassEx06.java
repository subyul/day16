package day16;
import java.util.Scanner;
class Ex06
{
	int [] seat = new int [7];
	int money = 0;
	int count = 0;
	}
public class ClassEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex06 e = new Ex06();
		
		while (true)
		{
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1] 좌석예매");
			System.out.println("[2] 종료하기");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.print("seat : ");
				for(int i = 0; i<e.seat.length;i++)
				{
					System.out.print(e.seat[i]+" ");
				}
				System.out.println();
				System.out.println("좌석 선택 :");
				int selseat = sc.nextInt();
				if(e.seat[selseat]==0)
				{
					e.seat[selseat] = 1;
					e.count +=1;
					
				}
				else
				{
					e.money = e.count*12000;
					System.out.println("이미 예매가 완료된 자리입니다");
					System.out.println("--------------------");
					System.out.println("매출액 : "+e.money);
					
				}
			}
			else if(select == 2)
			{
				System.out.println("프로그램 종료...");
				break;
			}
			
			
				
			
			
		}
		
	}

}
