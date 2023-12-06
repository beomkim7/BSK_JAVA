package com.winter.study2;

public class ArrayStudy3 {
	public static void main(String[] args) {
		int [] ar = {2,5,4,1,3};
		
		for(int i = 0 ; i<ar.length;i++) {
			int limit = i;
			for(int j = i ; j < ar.length-1; j++) {
				if(ar[limit]>ar[j+1]) {
					limit=j+1;
				}
			}int temp = ar[limit];
			ar[limit]=ar[i];
			ar[i]=temp;
		}for(int i = 0 ; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
//        int[] arr = new int[100];
//        
//        int[] check = new int[101];
//        for(int i = 0; i < 100; i++){
//            int random = (int)(Math.random()*100+1);
//            while (true){
//                if(check[random] == 1){
//                    random = (int)(Math.random()*100+1);
//                } else {
//                    check[random] = 1;
//                    arr[i] = random;
//                    break;
//                }
//            }
//        }
//        System.out.println(" ");
//        for(int i = 0 ;i < arr.length-1;i++) {
//        	int min =i;
//        	for(int j = i+1 ; j < arr.length;j++) {
//        		if(arr[min]>arr[j]) {
//        			    min=j;
//        			 
//        		}
//        		      		
//        	}
//        	int temp = arr[min];
//    		arr[min]=arr[i];
//    		arr[i]=temp;  
//        }
//        for(int i = 0;i<arr.length;i++) {
//        	
//        	System.out.print(arr[i]+" ");
//        }
    }
}
