class example{
  public static void main(String[] args) throws Exception{
    Person p = new Person();
    p.checkString(null);
  }
}
class Person{
  public void checkString(String a) throws Exception{

    if (a.equals("123")){
      System.out.println("Y");
    }
  }
}
