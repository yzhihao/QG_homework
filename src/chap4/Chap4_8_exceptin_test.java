package chap4;

public class Chap4_8_exceptin_test {

	/**
	 * test1():抛出“喝大了”异常
	 * test2():调用test1(),捕获“喝大了”异常，并且包装成运行时异常，继续抛出
	 * main方法中，调用test2(),尝试捕获test2()方法抛出的异常
	 */
	public static void main(String[] args) {
		Chap4_8_exceptin_test ct = new Chap4_8_exceptin_test();
		try{
			ct.test2();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void test1() throws Chap4_8_myexceptin{
		throw new Chap4_8_myexceptin("喝车别开酒！");
	}
	
	public void test2(){
		try {
			test1();
		} catch (Chap4_8_myexceptin e) {
			RuntimeException newExc = 
				new RuntimeException(e);
			//RuntimeException newExc = new RuntimeException("11111");
//			newExc.initCause(e);
			
			throw newExc;
		}
	}
}
