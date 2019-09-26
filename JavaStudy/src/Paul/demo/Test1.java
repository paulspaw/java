package Paul.demo;
/* 
* @Description:  数组的复制与赋值，地址是否相同
* @Param:  arr1,arr2
* @return:  
* @Author: Peng LIU
* @Date: 2019-09-26 
*/ 
public class Test1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,5,7,11,13,17,19};
        int[] arr2 = arr1;
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = i;
        }
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}