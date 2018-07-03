/**
    单例模式
    only one object for one class
    in case of too many objects for the class, in the singleton we will not
    allow anyone to create new objects

**/

public class Singleton{
  public static void main(String[] argv){
    System.out.println(single.getInstance());
    student xyf = student.getInstance();
    xyf.changeStudent(10,11,"jinyuan");
    xyf.printName();
  }
}
class single{
    private single(){}
    private static single a = new single();
//因为初始化function被private封装，无法创建，只有通过getInstance()获取唯一object，因而需要类名获取静态function
    public static single getInstance(){
      return a;
    }

}
class student{
  private int age;
  private int ID;
  private String name;
  private student(){}
  private static student xyf = new student();
  public static student getInstance(){
    return xyf;
  }
  public void changeStudent(int age,int ID, String name){
    this.age  = age;
    this.ID = ID;
    this.name = name;

  }
  public void printName(){
    System.out.println(this.name);
  }
}
