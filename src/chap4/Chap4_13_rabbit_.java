package chap4;

class Rabbit extends Thread {

	Tortoise tor;

	int Journey;

	int RabbitSpeed;

	public Rabbit(int rs, int j, Tortoise tortoise)

	{

		Journey = j;

		RabbitSpeed = rs;

		tor = tortoise;

	}

	synchronized public void run()

	{

		{

			try {

				wait(1000); /* 无论哪个线程选启动都立即进入等待,无论哪个线程跳出等待都唤醒所有线程 */

			} catch (InterruptedException e1) {

				e1.printStackTrace();

			}

			notifyAll();

		}

		System.out.println("----------兔子起跑了！---------");

		while (Journey >= 0)

		{

			System.out.println("兔子在跑");

			Journey = Journey - RabbitSpeed;

			if (Journey % 7 == 0)/* 何时兔子开始睡觉 */

			{

				try {

					System.out.println("兔子在睡觉-_-~~~~!");

					sleep(20);/* 设置兔子的睡觉时间 */

				} catch (InterruptedException e) {

					e.printStackTrace();

				}

			}

		}

		if (Journey < 0)

		{

			System.out.println("兔子到了终点");

		}

	}

}