class inter{
  public static void main(String[] args){
    //todo;
  }
}

interface inter1{
  public abstract void show();
  public static final int num =3;
}
interface inter2{
  public abstract void show2();
}
class Test implements inter1,inter2{
  public void show(){
    //todo
  }
  public void show2(){}
  // if the function name from two interfaces is the same, we just need to
  //decliear only one function in normal class.
}
interface A{
  void methodA();
}
interface B extends A{
  void methodB();
}
class D implements B{
  public void methodA(){}
  public void methodB(){}
}
