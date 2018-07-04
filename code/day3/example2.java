//get the duration of a programe
class example2{
  public static void main(String[] args){
    sub test = new sub();
    test.getTime();
  }
}
abstract class getTime{
  public final void getTime(){
    long start = System.currentTimeMillis();
    getfunction();
    long end = System.currentTimeMillis();
    System.out.println("End: "+ (end-start));
  }
  public abstract void getfunction();

}
class sub extends getTime{
  public void getfunction(){
    for(int i = 0;i<1000;i++){
      System.out.print("i");
    }
  }
}
