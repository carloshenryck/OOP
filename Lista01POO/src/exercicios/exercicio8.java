package exercicios;

public class exercicio8 {
	 public static void main(String args[]) {
		 for(int i = 1; i < 13; i++){
			 System.out.println(fibo(i));
		 }
	 }
	 
	 public static int fibo(int x){
		 if(x == 0){
			 return(0);
		 }else if (x == 1){
			 return(1);
		 }else{
	 		 return(fibo(x-1) + fibo (x-2));
		 }
	 }
}
