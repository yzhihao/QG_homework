package chap4;

class SellThread implements Runnable {

	int tickets = 100;

	Object obj = new Object();

	public void run()

      {

         while(true)

         {

            synchronized(obj)//加上一个同步关键字

            {

               if(tickets>0)

               {

                  try{

                     Thread.sleep(10);

                  } catch (InterruptedException e)

                  {

                     e.printStackTrace();

                  }

System.out.println("obj:"+Thread.currentThread().getName()+" sell tickets:"+tickets);

                  tickets--;

                  }

               }

            }

         }

}