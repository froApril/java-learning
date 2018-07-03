class supePart{
  public static void main(String[] argv){
    small a = new small("123");
    a.print();
  }
}
class large{
  private String name;
  large(String name){
    this.name = name;
  }
  void print(){
    System.out.println(this.name);
  }
}
class small extends large{
  small(String name){
    super(name);
  }
  void print(){
    super.print();
  }

}
