class FushuException extends Exception{
  FushuException(String msg){
    super(msg);
  }
}
class D{
  int div(int a, int b) throws FushuException{
    if (b<0){
      throw new FushuException("123");
    }
    return a/b;
    }
  }

class finalpart{
  public static void main(String[] args){
    D d = new D();
    try{
      int x = d.div(4,-1);
      System.out.println(x);
    }
    catch(FushuException e){
      System.out.println(e.toString());
    }
    finally{
      System.out.println("aqwsa");
    }

  }
}
