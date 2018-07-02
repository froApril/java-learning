class sweep_two_variables{
/**
  交换两值，只用两个变量
**/
  public static void main(String[] argv){
    int a = 10;
    int b = 11;
    a = a^b;
    b = a^b;
    a = a^b;
  }
}
