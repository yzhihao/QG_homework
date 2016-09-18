package chap2;

public class Chap2_36 {
	public Chap2_36() {
		System.out.println("我是无参构造函数");
	}
	
	public Chap2_36(int a) {
		System.out.println("我是差数为int的构造函数");
	}
	
	
	public static void main(String[] args) {
		new Chap2_36();
		new Chap2_36(2);
	}
}
