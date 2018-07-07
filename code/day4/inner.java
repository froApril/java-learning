class inner{
  public static void main(String[] args){
    outer a = new outer();
    a.method();
    outer.inner b = new outer().new inner();
    b.function();
  }
}
class outer{
  private int x = 3;
  class inner{
    int x = 4;
    void function(){
      int x =6;
      System.out.println(this.x);
    }
  }
  void method(){
    inner a = new inner();
    a.function();
  }
}
