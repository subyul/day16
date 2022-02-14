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
	hgd.name = "홍길동";
	hgd.score = 100;
	
	System.out.println("같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다");
	System.out.println("e.x: "+e.x);
	System.out.println("e.y: "+e.y);
	System.out.println("============================");
	System.out.println("hgd.name: "+hgd.name);
	System.out.println("hgd.score: "+hgd.score);
}
}
