class test{
  public static void main(String[] args){
    Test1.function().method();
    //Test1.function() 表示Test1 class中有一个静态的function（）
    //.method()表示function在运行后return一个Inter类型的object因为只有Inter能
    //调用method（）
  }
}
interface Inter{
  void method();
}
class Test1{
  // class inner implements Inter{
  //   void method(){
  //     System.out.println("1");
  //   }
  // }


public static Inter function(){
  return new Inter(){
    public void method(){
       System.out.println("1");
    }
  };
}

}
