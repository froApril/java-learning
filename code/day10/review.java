class review{
  public static void main(String[] args){
    Res a = new Res();
    // input in = new input(a);
    // output out = new output(a);
    // Thread t1 = new Thread(in);
    // Thread t2 = new Thread(out);
    // t1.start();
    // t2.start();
    new Thread(new input(a)).start();
    new Thread(new output(a)).start();

  }
}
class Res{
  private String name;
  private String sex;
  private boolean flag=false;
  public synchronized void set(String name, String sex){
    if(flag){
      try{this.wait();}catch(Exception e){}
    }
    this.name = name;
    this.sex = sex;
    flag = true;
    this.notify();
  }
  public synchronized void out(){
    if(!flag){
      try{this.wait();}catch(Exception e){}
    }
    System.out.println(name+"....."+sex);
    flag = false;
    this.notify();
  }
}
class input implements Runnable{
  Res a = new Res();
  input(Res a){
    this.a = a;
  }
  public void run(){
    int x= 0;
    while(true){
       // synchronized(a){
       //   if(a.flag){
       //     try{a.wait();}catch(Exception e){}
       //   }

        if(x==0){
          a.set("123","123");
        }
        else{
          a.set("asd","asd");
        }
           x = (x-1)%2;

    }

  }
}
class output implements Runnable{
  Res a = new Res();
  output(Res a){
    this.a  = a;
  }
  public void run(){
    while(true){
      a.out();
      // synchronized(a){
      //     if(!a.flag){
      //       try{a.wait();}catch(Exception e){}
      //     }
      //     System.out.println(a.name +"....."+a.sex);
      //     a.flag = false;
      //     a.notify();
      // }
    }
  }

}
