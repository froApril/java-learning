class computer{
  public static void main(String[] args){
    Mainboard a = new Mainboard();
    a.run();
    a.usePCI(null);
    a.usePCI(new CPU());
  }
}
/*
class Mainboard{
  public void run(){
    System.out.println("Mainboard run");
  }
  public void statr_CPU(CPU a){
    a.start();
  }
}
class CPU{
  public void start(){
    System.out.println("CPU start");
  }
}
*/
interface PCI{
  public void open();
  public void close();
}
class Mainboard {
  public void run(){
    System.out.println("run");
  }
  public void usePCI(PCI a){
    if (a!=null){
      a.open();
      a.close();

    }

  }
}
class CPU implements PCI{
  public void open(){
    System.out.println("CPU open");
  }
  public void close(){
    System.out.println("CPU close");
  }
}
