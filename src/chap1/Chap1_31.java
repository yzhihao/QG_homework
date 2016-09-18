package chap1;

public class Chap1_31 {
	 @SuppressWarnings("unused")
	public void sort(int[] args){
	  
	  int time1 = 0,time2 = 0;
	  for(int i = 0 ; i < args.length-1 ; i++){
	   ++time1;
	   for(int j = i+1 ; j < args.length ; j++){
	    ++time2;
	    int temp ;
	    if(args[i] < args[j]){
	     temp = args[j];
	     args[j] = args[i];
	     args[i] = temp;
	    }
	   }
	  }
	  System.out.println("排序后：");
	  for(int n : args){
	   System.out.print(n+" ");
	  }
	 }
	 public static void main(String[] args) {
	  int[] arg = new int[]{20,10,50,40,30,70,60,80,90,100};
	  new Chap1_31().sort(arg);
	 }
	}
