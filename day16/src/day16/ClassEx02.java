package day16;
class Student{
	String name;
	int score;
}
public class ClassEx02 {
public static void main(String[] args) {
	Ex01 e = new Ex01();
	e.x = 10;
	e.y = 20;
	
	Student hgd = new Student();
	hgd.name = "ȫ�浿";
	hgd.score = 100;
	
	System.out.println("���� ��Ű�� ���� Ŭ������ �ٸ� Ŭ�������� ����� �����ϴ�");
	System.out.println("e.x: "+e.x);
	System.out.println("e.y: "+e.y);
	System.out.println("============================");
	System.out.println("hgd.name: "+hgd.name);
	System.out.println("hgd.score: "+hgd.score);
}
}
