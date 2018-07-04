class try1{
  public static void main(String[] argv){
    male a = new male();
    a.test();
  }
}
abstract class student{
  abstract void study();
  void test(){
    System.out.println("2");

  }
}

class male extends student{
  void study(){
    System.out.println("1");
  }
}
