// class Doit extends Thread{
//   public void run(){
//     for(int i = 0;i<60;i++){
//       System.out.println("123"+i);
//     }
//
//   }
// }

class tryCreateThread{
    public static void main(String[] args){
      Thread a = new Thread(){
        public void run(){
          for(int i = 0;i<60;i++){
            System.out.println("123"+i);
            }
        }
      };//new Thread
      a.start();
      for(int i = 0;i<60;i++){
        System.out.println("abc"+i);
      }

    }
}
