/*
hungry:
class Single{
    private static final Single a = new Single();
    private Single(){}
    public static Single getInstance(){
       return a;
  }
}
lazy:
class Single{
  private static Single a = null;
  private Single(){}
  public static Single getInstance(){
      if(a == null){
          a = new Single();
      }
      return a;
}
}

*/
class Single{
  private static Single a  = null;
  private Single(){}
  public static synchronized Single getInstance(){
    if(a==null){
      a = new Single();
    }
    return a;
  }
}


class SingleDemo{
  public static void  main(String[] args){

  }
}
