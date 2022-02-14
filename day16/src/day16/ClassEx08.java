package day16;
import java.util.Scanner;
class Ex08{
	int[] game= {0,0,1,0,2,0,0,1,0};
}
public class ClassEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex08 e = new Ex08();
		
		while (true)
		{
			for(int i = 0; i<e.game.length;i++)
			{
				System.out.print(e.game[i]+" ");
			}
			System.out.println();
			System.out.print("¿ÞÂÊ(1) ¿À¸¥ÂÊ(2) : ");
			int data = sc.nextInt();
			
			
			
			if(data == 1)
			{
				for(int i = 1; i<e.game.length;i++)
				{
					if(e.game[i]==2)
					{
					int temp = e.game[i-1];
					e.game[i-1] = e.game[i];
					e.game[i] = temp;
					}
				}	
			}
			else if(data == 2)
			{
				for(int i = 1;i<e.game.length;i++)
				{
					if(e.game[i]==2)
					{
						e.game[i+1]=2;
						e.game[i] = 0;
					}
				}
			}
		}
	}
}
