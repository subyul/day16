package day16;
import java.util.Scanner;
class Rectangle{
	int width;
	int height;
	public int getArea(){
		return width*height;
	}
}
public class RectApp {
public static void main(String[] args) {
	Rectangle rec = new Rectangle();
	Scanner sc = new Scanner(System.in);
	System.out.println(">>");
	rec.width = sc.nextInt();
	rec.height = sc.nextInt();
	
	System.out.println("사각형의 면적은"+rec.getArea());
	sc.close();
	
}
}
 