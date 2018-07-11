class Tickets implements Runnable{
  private static int num = 100;
  public boolean flag = true;
  // Object obj = new Object();
  public void run(){
    if(this.flag){
      while(true){
        synchronized(Tickets.class){
            if (num>0){
              System.out.println(Thread.currentThread().getName() + " method "+num--);
            }
        }
      }
    }
    else{
      while(true){
        show();
      }

    }
  }
  public synchronized static void show(){
      if (num>0){
        System.out.println(Thread.currentThread().getName() + " show "+num--);
      }

  }
}


class ThisLockDemo{
  public static void main(String[] args){
    Tickets a = new Tickets();
    Thread t1 = new Thread(a);
    Thread t2 = new Thread(a);
    t1.start();
    try{Thread.sleep(10);}catch(Exception e){}
    a.flag = false;
    t2.start();

  }
}
