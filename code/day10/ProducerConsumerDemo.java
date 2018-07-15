class ProducerConsumerDemo{
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
  public synchronized void set(String name){
    while(this.flag){
      try{this.wait();}catch(Exception e){}
    }
    this.name = name+"--"+count++;
    System.out.println(Thread.currentThread().getName()+"..in.."+this.name);
    flag = true;
    this.notifyAll();
  }
  public synchronized void out(){
    while(!this.flag){
      try{this.wait();}catch(Exception e){}
    }
    System.out.println(Thread.currentThread().getName()+"..out.."+this.name);
    flag = false;
    this.notifyAll();
  }
}
class producer implements Runnable{
  private Res a;
  producer(Res a){
    this.a = a;
  }
  public void run(){
    while(true){
      a.set("things");
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
      a.out();
    }
  }
}
