import java.util.*;
class TreeSetTest{
  public static void main(String[] args){
    TreeSet<String>test = new TreeSet<>(new Mycomparator());
    test.add("aszxc");
    test.add("asdzx");
    test.add("aas");
    test.add("asioxcihxjkn");
    Iterator temp = test.iterator();
    while(temp.hasNext()){
      System.out.println(temp.next());
    }
  }
}
class Mycomparator implements Comparator{
  public int compare(Object a, Object b){
    String t1 = (String) a;
    String t2 = (String) b;
    int dis = t1.length()-t2.length();
    if(dis==0){
      return t1.compareTo(t2);
    }
    return dis;

  }
}
