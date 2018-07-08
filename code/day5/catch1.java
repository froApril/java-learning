class catch1{
  public static void main(String[] args){
    D a = new D();
      int x = a.div(4,-1);
      System.out.println(x);
    // catch(MyException e){
    //   System.out.println(e.toString());
    //   System.out.println(e.getValue());
    // }
  }
}

// class MyException extends Exception{
//   private int value;
//
//   MyException(String msg,int value){
//     super(msg);
//     this.value = value;
//   }
//   public int getValue(){
//     return this.value;
//   }
//
// }
class FushuException extends RuntimeException{
  FushuException(String msg){
    super(msg);
  }
}

class D{
  int div(int a, int b){
    if (b<0){
      throw new FushuException("213");
    }

    // if(b=0){
    //   throw new ArithmeticException("123!!@#",b);
    // }
    return a/b;
  }
}
