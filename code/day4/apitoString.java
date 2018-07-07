class apitoString{
  public static void main(String[] args){
    D a = new D();
    System.out.println(a.getClass().getMethods());
    System.out.println(a.getClass().getName() + '@'+Integer.toHexString(a.hashCode()));

  }
}
class D{
  public void show(){

  }

}
