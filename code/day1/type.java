class type{
  public static void main(String[] agrv){
    System.out.println('a');// print out the character
    System.out.println('a'+1);// print the sum of Assci number of the character and the number
    System.out.println(3<<3);
    // exchange two variables without the third one
    int a = 10;
    int b = 11;
    a = a^b;
    b = a^b;
    a = a^b;
    System.out.println(a);
    System.out.println(b);
    int x, y,z;
    x = 3;
    y = 4;
    z = (x>y)?x:y;//check if x is bigger than y, if true, save situation1, else 2.
    z = (x>y)?2:1;//z == 1!!
    System.out.println(z);

  }
}
