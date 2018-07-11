class bank{
  public static void main(String[] args){
    save a = new save();
    Thread t1 = new Thread(a);
    Thread t2 = new Thread(a);
    t1.start();
    t2.start();
  }
}
class jinku{
  private int sum;
  public synchronized void add(int n){
    this.sum +=n;
    System.out.println("Sum "+ this.sum);
  }
}
class save implements Runnable{
  private jinku a = new jinku();
  Object obj = new Object();
  public void run(){
    for(int i = 0; i<3;i++){
        a.add(100);

    }
  }
}
