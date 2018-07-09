class try1{

  public static void main(String[] args){
    B x = new B();
    x.show("1");

  }
  // 只有进行构造对象的function中默认super()
}
class A{
  void show(String a){
    System.out.println("from A" );

  }
  // A(){
  //   System.out.println("from A1" );
  //
  // }


}
class B extends A{
  void show(String a){
    System.out.println("A");
  }
}
