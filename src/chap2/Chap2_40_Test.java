package chap2;

public class Chap2_40_Test extends Chap2_40_4 implements Chap2_40_1, Chap2_40_2 {

	@Override
	public void a2() {
		System.out.println("a2");
	}

	@Override
	public void b2() {
		System.out.println("b2");
	}

	@Override
	public void a1() {
		System.out.println("a1");
	}

	@Override
	public void b1() {
		System.out.println("b1");
	}

	public static void main(String[] args) {
		Chap2_40_Test chap2_40_Test = new Chap2_40_Test();
		chap2_40_Test.a1();
		chap2_40_Test.a2();
		chap2_40_Test.a4();
		chap2_40_Test.b1();
		chap2_40_Test.b2();
	}
}
