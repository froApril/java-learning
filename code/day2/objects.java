public class objects{
  String a1 ="1";
  static String b = "2";
  public static void main(String[] argv){
    Car a = new Car("jinyuan");
    a.setPrice(1000);
    a.setDate("1/1/2000");
    System.out.println(Car.test);//static!
    pri(b);

    // a.name = "1"; it could not be done if name in Car is private
  }
  public static void pri(String a ){
    System.out.println(a);
  }
}
class Car{
    static int test = 0;
    private String name;
    private int price;
    private String date;
    public Car(String name){
      this.name  = name;
    }
    public void setPrice(int price){
      this.price = price;
      System.out.println(this.price);
    }
    public void setDate(String Date){
      this.date = Date;
      System.out.println(this.date);
    }

}
