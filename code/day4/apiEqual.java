class apiEqual{
  public static void main(String[] args){
    D a = new D(10);
    D b = new D(10);
    System.out.println(a.equals(b));
    P c = new P();
    System.out.println(a.equals(c));

  }
}
class D{
  int a;
  D(int a){
    this.a = a;
  }
  public boolean equals(Object obj){
    if (!(obj instanceof D)){
      return false;
    }
    D x = (D) obj;
    return this.a==x.a;
  }

}
class P{

}
