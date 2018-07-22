import java.util.*;
class listDemo{
  public static void main(String[] args){
    ArrayList<String> a = new ArrayList<String>();
    a.add("1");
    a.add("2");
    a.add("3");
    // a.add("4");
    ListIterator<String> i = a.listIterator();
    /*
    以下代码会显示NoSuchElementException， 因为next（）在调用时内存指针默认
    初始指向index0，每检测一次next（）实际向后移动一位，当remove第一位后，指针
    实际位置为index1，所以第二次if检测为空。
    */
    while(i.hasNext()){
        if(i.next().equals("1")){
          i.remove();
        }
        if(i.next().equals("5")){
          i.add("4");
        }


      }
    sop(a);
    }

  public static void sop(Object obj){
      System.out.println(obj);
    }

  }
