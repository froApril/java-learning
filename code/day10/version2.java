import java.util.concurrent.locks.*;
class version2{
  public static void main(String[] args){
    Res a = new Res();
    new Thread(new producer(a)).start();
    new Thread(new consummer(a)).start();
    new Thread(new producer(a)).start();
    new Thread(new consummer(a)).start();
  }
}

class Res{
  private String name;
  private int count=1;
  private boolean flag = false;
  private Lock lock = new ReentrantLock();
  private Condition condition_pro = lock.newCondition();
  private Condition condition_cus = lock.newCondition();
  public void set(String name) throws Exception{
    lock.lock();
    try{
      while(this.flag){
        condition_pro.await();
      }
      this.name = name+"--"+count++;
      System.out.println(Thread.currentThread().getName()+"..in.."+this.name);
      flag = true;
      condition_cus.signal();
    }finally{
      lock.unlock();
    }

  }
  public void out() throws Exception{
    lock.lock();
    try{
      while(!this.flag){
        condition_cus.await();
      }
      System.out.println(Thread.currentThread().getName()+"..out.."+this.name);
      flag = false;
      condition_pro.signal();
    }finally{
      lock.unlock();
    }
  }
}
class producer implements Runnable{
  private Res a;
  producer(Res a){
    this.a = a;
  }
  public void run(){
    while(true){
      try{
        a.set("things");
      }
      catch(Exception e){}
    }
  }
}
class consummer implements Runnable{
  private Res a;
  consummer(Res a){
    this.a  = a;
  }
  public void run(){
    while(true){
      try{
        a.set("things");
      }
      catch(Exception e){}
    }
  }
}
