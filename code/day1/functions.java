/**
Try to sort an array using choosing sort, the time complexity is O(n)+O(n)*(O(n)*2).
The space complexity is O(n). It is much easier to do that with ArrayList and BST,
while the time complexity is O(nlogn), better.
**/
class functions{
  public static void main(String[] argv){
    int[] a = new int[]{1,2,3,4,5,6};
    // System.out.println(findMax(a));
    int[] b = new int[]{8,6,9,5,7,1};
    int[] b1 = choosing_sort(b);
    bubble_sort(b);
    // System.out.println(b1[0]);
    for(int i : b){
      System.out.println(i);
    }
  }
  /**
  find max int valu in array
  **/
  static int findMax(int[] a){
    int p = 0;
    for(int i:a){
      p =(i>p)?i:p;
    }
    return p;
  }
  static int findMin(int[] a){
    int p = 100;
    for(int i : a){
      p  = (i<p)?i:p;
    }
    return p;
  }

  static int[] delet(int[] a,int p){
    int[] f = new int[a.length-1];
    int poi = 0;
    for(int i:a){
      if(p == i){
        continue;
      }
      else{
        f[poi] = i;
        poi += 1;
      }
    }
    return f;
  }
  static int[] choosing_sort(int[] array){
    int[] r = new int[array.length];
    int[] array1 = array;
    for(int i = 0; i<array.length;i++){
      int temp = findMin(array1);
      array1 = delet(array1,temp);
      r[i] = temp;
    }
    return r;
  }
  /**
  冒泡算法
  **/
 static void bubble_sort(int[] array){
   for (int i = 0 ; i<array.length;i++){
     for (int j = 0; j<array.length;j++){
       if(i>j && array[i]<array[j]){
         int temp =array[i];
         array[i] = array[j];
         array[j] = temp;
       }
       }
     }
   }
 }
