public class severalClass{
  public static void main(String[] argv){
    boy xyf = new boy();
    xyf.set("xyf",123);
    System.out.println(xyf.name);
    System.out.println(xyf.luguan);
  }
}

class student{
    String name;
    int ID;
    public void set(String name, int ID){
      this.name = name;
      this.ID = ID;
    }
}
class boy extends student{
    String luguan="1 per week";
}
class girl extends student{
    String jiatui="2 per week";
}
