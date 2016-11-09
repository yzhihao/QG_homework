package chap4;

public class Chap4_13_TortoiseAndrabbit extends Thread {

	int Journey;

	int r;

	int t;

	Rabbit Rab;

	Tortoise Tor;

	public Chap4_13_TortoiseAndrabbit(int rs, int ts, int j)

	{

		Journey = j;

		r = rs;

		t = ts;

	}

	public void run()

	{

		/* 设计初期把每个线程对象传给对方,但在这段程序中并没有使用可以去除 */

		Rab = new Rabbit(r, Journey, Tor);

		Tor = new Tortoise(t, Journey, Rab);

		Rab.setPriority(Thread.MAX_PRIORITY);

		Tor.setPriority(Thread.MAX_PRIORITY);

		Rab.start();

		Tor.start();

	}

	public static void main(String[] args) {

		/* 参数一为兔子的速度,参数二是龟龟的速度,参数三是路程 */

		new Chap4_13_TortoiseAndrabbit(6, 2, 100).start();

	}

}