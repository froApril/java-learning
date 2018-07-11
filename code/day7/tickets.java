/*
Several windows selling tickets at the same time
*/

class tickets{
  public static void main(String[] args){
    // win1 first = new win1();
    // first.setNum(100);
    // win1 second = new win1();
    // first.start();
    // second.start();
    win1 first = new win1();
    Thread t1 = new Thread(first);
    Thread t2 = new Thread(first);
    Thread t3 = new Thread(first);
    Thread t4 = new Thread(first);
    t1.start();
    t2.start();
    t3.start();
    t4.start();

  }

}

class win1 implements Runnable {
  private int num=10000;
  Object obj = new Object();
  public void run(){
    // synchronized(obj){
      while(true){
        // try{
        //   Thread.sleep(10);
        // }
        // catch(Exception e){
        //
        // }
        synchronized(obj){
          if(num>0){
            System.out.println(Thread.currentThread().getName()+" sell "+ num--);
          }
        }
      }
    }

}
