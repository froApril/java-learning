class upperTosub{
  public static void main(String[] args){
    function(new Dog());
  }
  public static void function(Animal a){
    if (a instanceof Cat){
      Cat temp = (Cat) a;
      temp.run();
    }
    if(a instanceof Dog){
      Dog temp = (Dog) a;
      temp.run();
    }
  }
}
abstract class Animal{
  abstract public void eat();
}
class Cat extends Animal{
  public void eat(){
    System.out.println("1");
  }
  public void run(){
    System.out.println("2");
  }
}
class Dog extends Animal{
  public void eat(){
    System.out.println("3");
  }
  public void run(){
    System.out.println("4");
  }
}
