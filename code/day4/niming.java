class niming{
  public static void main(String[] args){
    new outer().function();
  }
}

abstract class abs{
  abstract void show();
}
//all the methods in sub objects could only be used once
class outer{
  int x =3;
  /*
  class inner extends abs{
    void show(){
      System.out.println(x);
    }
  }
  */
  public void function(){
    // new inner().show();
    abs a = new abs(){
      void show(){
        System.out.println(x);
      }
    }
  }
  a.show();



}
