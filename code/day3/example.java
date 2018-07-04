class example{
  public static void main(String[] args){
    //todo
  }
}
abstract class employee{
  private String name;
  private int ID;
  private int pay;
  employee(String name, int ID,int pay){
    this.name = name;
    this.ID = ID;
    this.pay = pay;
  }
  public abstract void work();

}
class manager extends employee{
  private int money;
  manager(String name, int ID, int pay, int money){
    super(name,ID,pay);
    this.money = money;
  }
  public void work(){};
}
