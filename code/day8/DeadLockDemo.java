class Test implements Runnable{
  private boolean flag;
  Test(boolean flag){
      this.flag = flag;
  }
  public void run(){
    if (flag){
      synchronized (lock.locka){
        System.out.println("locka");
        synchronized (lock.lockb){
          System.out.println("lockb");
        }
      }
    }
    else{
      synchronized (lock.lockb){
        System.out.println("lockb");
        synchronized (lock.locka){
          System.out.println("locka");
    }
  }
}
}
class lock{
  static Object locka = new Object();
  static Object lockb = new Object();

}

class DeadLockDemo{
  public static void main(String[] args){
    Thread t1 = new Thread(new Test(true));
    Thread t2 = new Thread(new Test(false));
    t1.start();
    t2.start();

  }
}
