
class database{
  public static void main(String[] args){
    general a = new userinfo();//任意一个子类
    a.add(user);
  }
}
interface general{
  public void add(User user);
  public void delete(User user);
}
class userinfo implements general{

  public void add(User user){

  }
  public void delete(User user){

  }
}
class infor2 implements general{

}
