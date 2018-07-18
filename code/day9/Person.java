class Person{
  public static void main(String[] args){
    Res r = new Res();
    input in = new input(r);
    output out = new output(r);
    Thread t1 = new Thread(in);
    Thread t2 = new Thread(out);
    t1.start();
    t2.start();



  }
}

class Res{
  String name;
  String sex;
  boolean flag = false;
}
class input implements Runnable{
  Res r;
  input(Res r){
    this.r = r;
  }
  public void run(){
    int x = 0;
    while(true){
      synchronized(r){
        if (r.flag){
          try{r.wait();}catch(Exception e){}
        }
        if(x==0){
          r.name = "123";
          r.sex = "213";
        }

        else{
          r.name = "asd";
          r.sex = "zvvv";
        }
        x = (x-1)%2;
        r.flag = true;
        r.notify();

      }
  }

  }
}
class output implements Runnable{
  Res r;
  output(Res r){
    this.r = r;
  }
  public void run(){

    while(true){
      synchronized(r){
        if(!r.flag){
          try{r.wait();}catch(Exception e){}
        }
        System.out.println(r.name +" "+r.sex);
        r.flag = false;
        r.notify();
      }
    }

  }
}
