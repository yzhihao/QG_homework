package chap4;

public

class chap4_17

{

   public static void main(String[] args)

   {

      SellThread st=new SellThread();

      new Thread(st).start();
      new Thread(st).start();
      new Thread(st).start();
     new Thread(st).start();

   }

}