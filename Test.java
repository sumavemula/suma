class Test{
	public static void main(String[]args){

		num(10);

}			
		public static int num(int n){
		
		if(n>0){
			num(n-1);
			System.out.println(n);
			
		}
		return 0;
	}
}