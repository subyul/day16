package day16;
import java.util.Scanner;
class Ex05{
	String name = "";
	
	int [] ids = {1001,1002,1003,1004,1005};
	int [] arScore = {92,38,87,100,11};
}
public class ClassEx05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Ex05 e = new Ex05();
	int max = 0;
	int min = 0;
	
	while(true)
	{
		System.out.println("=== "+e.name+"===");
		System.out.println("1. ������ ����Ȯ��");
		System.out.println("2. 1���л� ����Ȯ��");
		System.out.println("3. �õ��л� ����Ȯ��");
		System.out.println("4. ���� Ȯ���ϱ�");
		System.out.println("5. �����ϱ�");
		System.out.println("�޴� ���� :");
		int select = sc.nextInt();
		
		if(select == 1)
		{
			for(int i = 0; i<e.arScore.length;i++)
			{
				System.out.print(e.arScore[i]+" ");
			}
			System.out.println();
		}
		else if(select == 2)
		{
			for(int i = 0; i<e.arScore.length;i++)
			{
				if(max<e.arScore[i])
				{
					max = e.arScore[i];
				}
			}
			System.out.println("1�� ����: "+max);
		}
		else if(select == 3)
		{
			for(int i = 0; i<e.arScore.length;i++)
			{
				min = e.arScore[0];
				if(min>e.arScore[i])
				{
					min= e.arScore[i];
				}
			}
			System.out.println("�õ� ����: "+min);
		}
		else if(select == 4)
		{
			System.out.println("���� Ȯ�ο� �й� �Է�:");
			int data = sc.nextInt();
			
			for(int i = 0; i<e.ids.length;i++)
			{
				if(data == e.ids[i])
				{
					System.out.println(e.arScore[i]);
				}
				else
				{
					continue;
				}
			}
		}
		else if(select == 5)
		{
			System.out.println("���α׷� ����...");
			break;
		}
	}
}
}
