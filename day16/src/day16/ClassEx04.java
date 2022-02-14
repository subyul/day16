package day16;
import java.util.Scanner;
import java.util.Random;
class Ex04{
	int [] ids = {1001,1002,1003,1004,1005};
	int [] scores = new int [5];
}
public class ClassEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Ex04 e = new Ex04();
		
		for(int i = 0;i<e.scores.length;i++)
		{
			e.scores[i] = ran.nextInt(100)+1;
			System.out.print(e.scores[i]+" ");
		}
		System.out.println();
		int sum = 0;
		
		for(int i = 0; i<e.scores.length;i++)
		{
			sum = sum+e.scores[i];
		}
		int avg = sum/5;
		System.out.println("1. 총점:"+sum+"  평균:"+avg);
		
		int count = 0;
		for(int i = 0; i<e.scores.length;i++)
		{
			if(e.scores[i]>=60)
			{
				count+=1;
			}
		}
		System.out.println("2. 합격생 수:"+count);
		
		
		System.out.println("3. 출력할 인덱스를 입력하세요");
		int dtid = sc.nextInt();
		for(int i = 0; i<e.ids.length;i++)
		{
			if(dtid == i)
			{
				System.out.println(e.scores[i]);
			}
			else
			{
				continue;
			}
		}
		System.out.println("4. 출력할 성적을 입력하세요");
		int pt = sc.nextInt();
		
		for(int i = 0;i<e.scores.length;i++)
		{
			if(pt==e.scores[i])
			{
				System.out.println(e.ids[i]);
			}
		}
		
		System.out.println("5.출력할 학번을 입력하세요");
		int dtnum = sc.nextInt();
		
		for(int i = 0;i<e.scores.length;i++)
		{
			if(dtnum==e.ids[i])
			{
				System.out.println(e.scores[i]);
			}
		}
		int max = 0;
		int maxid = 0;
		for(int i = 0;i<e.scores.length;i++)
		{
			if(max <e.scores[i])
			{
				max = e.scores[i];
				maxid = e.ids[i];
			}
		}
		
		System.out.println(max);
		System.out.println(maxid);
	
	}

}
