class ThreadTest{
  public static void main(String[] args){
    Test1 a = new Test1();
    Test2 b = new Test2();
    // a.start();
    System.out.println(a.getPriority());
    System.out.println(b.getPriority());
    // b.start();
    // for (int i = 0; i<50;i++){
    //   System.out.print("from main "+ i);
    // }
  }
}
class Test1 extends Thread{
  public void run(){
    for (int i = 0; i<50;i++){
      System.out.print("from 1 "+ i);
    }
  }
}
class Test2 extends Thread{
  public void run(){
    for(int i = 0; i<100;i++){
      System.out.print("from 2 "+i);
    }
  }

}
