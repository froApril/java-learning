class Thread2{
  public static void main(String[] args){
    A a = new A("one ");
    a.start();

  }
}

class A extends Thread{
  A(String name){
    super(name);
  }
  public void run(){
    System.out.println(this.getName());
    System.out.println((Thread.currentThread()==this));

  }
}
