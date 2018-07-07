class mutiple{
  public static void main(String[] args){
    //todo
    Person a = new male(1);
    a.name("xyf");
    function(a);

  }

  public static void function(Person a){
    a.show();
  }

}
abstract class Person{
  public abstract void name(String name);
  public abstract void show();

}
class male extends Person{
  private int ID;
  private String name;
  public male(int ID){
    this.ID = ID;
  }
  public void name(String name){
    this.name = name;
  }
  public void show(){
    System.out.println(this.name);
  }

}
