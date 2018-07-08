class lianxi{
  public static void main(String[] args){
    circle a = new circle(-2);
    a.getSpace();
    try{
        rectangle b = new rectangle(-1,4);
        b.getSpace();
    }
    catch(MyException e){
      System.out.println(e.toString());
    }
    System.out.println("end");

  }
}
class MyException extends Exception{
  MyException(String msg){
    super(msg);
  }
}
class MyException1 extends RuntimeException{
  MyException1(String msg){
    super(msg);
  }
}


interface function{
  void getSpace();
}
class circle implements function{
  public static final double PI=3.14;
  private double r;
  circle(double r){
    if(r<0){
      throw new MyException1("12312321circle");
    }
    this.r = r;
  }
  public void getSpace(){
    System.out.println(this.r * this.r * PI);
  }
}
class rectangle implements function{
  private double len;
  private double wid;
  rectangle(double len,double wid) throws MyException{
    if(len<0 || wid<0){
      throw new MyException("111111");
    }
    this.len = len;
    this.wid = wid;
  }
  public void getSpace(){
    System.out.println(this.len * this.wid);
  }

}
