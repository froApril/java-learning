/*
try-catch:
try{

}
catch(){

}finally{

}
*/


class errocatch{
  public static void main(String[] args) {
    Divide temp = new Divide();
    int x = temp.div(4,0);
    System.out.println(x);
  }
}
class Divide {
  int div(int a, int b) {
    if(b==0){
      throw new RuntimeException("123");

    }
    return a/b;
  }
}
