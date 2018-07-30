import java.util.*;
class sed{
  public static void main(String[] args){
    TreeSet<Person>a = new TreeSet<>(new CompareMy());
    a.add(new Person("213",1));
    a.add(new Person("13",2));
    Iterator p = a.iterator();
    while(p.hasNext()){
      Person temp = (Person)p.next();
      System.out.println(temp.getName());
    }
  }
}
class CompareMy implements Comparator{
  public int compare(Object a, Object b){
    Person t1 = (Person) a;
    Person t2 = (Person) b;
    int num =t1.getName().compareTo(t2.getName());
    if(num ==0){
      return new Integer(t1.getAge()).compareTo(new Integer(t2.getAge()));
    }
    return num;
  }
}
class Person{
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
