package day16;
import java.util.Scanner;
import java.util.Random;
class Ex07{
	int [] answer = {1,3,4,2,5};
	int [] hgd = new int[5];
	String[] ox = new String[5];
	
	int count = 0;
}
public class ClassEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Random ran = new Random();
		Ex07 e = new Ex07();
		System.out.print("[");
		for(int i = 0; i<e.hgd.length;i++)
		{
			System.out.print(e.answer[i]+" ");
		}
		System.out.println("]");
		for(int i = 0; i<e.hgd.length;i++)
		{
			e.hgd[i] = ran.nextInt(5);
		}
		
		System.out.print("[");
		for(int i = 0; i<e.hgd.length;i++)
		{
			System.out.print(e.hgd[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		for(int i = 0;i<e.answer.length;i++)
		{
			if(e.answer[i]==e.hgd[i])
			{
				e.ox[i] = "O";
				e.count +=1;
			}
			else
			{
				e.ox[i] = "X";
			}
		}
		System.out.print("{");
		for(int i=0; i<e.ox.length;i++)
		{
			
			System.out.print(e.ox[i]+" ");
		}
		System.out.print("}");
		System.out.println();
		System.out.println("¼ºÀû: "+e.count*20);
		
	}

}
