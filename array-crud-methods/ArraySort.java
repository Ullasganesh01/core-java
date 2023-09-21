class ArraySort {
    //static int prices[] = {567,78,12,90,1};
    
  public static int[] desc(int arr[]) {
    for(int i=0; i<arr.length;i++){
        for(int j = 0; j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }    
    return arr;
  }

  public static int[] asc(int arr[]) {
    for(int i=0; i<arr.length;i++){
        for(int j = 0; j<arr.length;j++){
            if(arr[i]<arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }    
    return arr;
  }

  public static int greatestNumber(int arr[]){
    desc(arr);
    int gtNum = arr[0];
    System.out.println(gtNum);
    return gtNum;
  }

  public static void getArray(int[] arr){
    for(int i : arr){
        System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void maxEle(int arr[]){
    int max = arr[0];
      for(int index = 0; index < arr.length ; index++){
        if(max < arr[index]){
            max = arr[index];
        }
      }
      System.out.println(max);
  }

  public static void minEle(int arr[]){
    int min = arr[0];
      for(int index = 0; index < arr.length ; index++){
        if(min > arr[index]){
            min = arr[index];
        }
      }
      System.out.println(min);
  }
    
}
