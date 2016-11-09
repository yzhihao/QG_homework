package chap4;

class Tortoise extends Thread {

	int Journey;

	int TortoiseSpeed;

	Rabbit rab;

	Tortoise(int ts, int j, Rabbit rabbit)

	{

		Journey = j;

		TortoiseSpeed = ts;

		rab = rabbit;

	}

	synchronized public void run()

	{

		{

			try {

				wait(1000);/* 无论哪个线程选启动都立即进入等待,无论哪个线程跳出等待都唤醒所有线程 */

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			notifyAll();

		}

		System.out.println("----------龟龟起跑了！---------");

		while (Journey >= 0)

		{

			System.out.println("龟龟在跑");

			Journey = Journey - TortoiseSpeed;

		}

		if (Journey < 0)

		{

			System.out.println("龟龟到了终点");

		}

	}

}
