import java.util.*;
class TreeSetDemo{
  public static void main(String[] args){
    TreeSet<Person>a = new TreeSet<>();
    a.add(new Person("213",1));
    a.add(new Person("13",1));
    Iterator p = a.iterator();
    while(p.hasNext()){
      Person temp = (Person)p.next();
      System.out.println(temp.getName());
    }
  }
}
class Person implements Comparable{
  private int age;
  private String name;
  Person(String name, int age){
    this.age =age;
    this.name =name;
  }
  public int compareTo(Object obj){
    if(!(obj instanceof Person)){
      throw new RuntimeException("123!!!!!");
    }
    Person temp = (Person)obj;
    if(temp.getAge()==this.age){
      return this.name.compareTo(temp.getName());
    }
    return this.age-temp.getAge();
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
}
