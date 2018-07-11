class BankDemo{
  public static void main(String[] args){
    User a =new User();
    Thread t1 = new Thread(a);
    Thread t2 = new Thread(a);
    t1.start();
    t2.start();
  }
}
class Cu {
  private int sum;
  public synchronized void add(int num){
    sum +=num;
    System.out.println(Thread.currentThread().getName()+" add "+this.sum);
  }
}
class User implements Runnable{
  private Cu bank = new Cu();
  public void run(){
    for (int i = 0; i<3; i++){
      bank.add(100);
    }
  }
}
