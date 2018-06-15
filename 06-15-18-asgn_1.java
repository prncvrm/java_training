//wap a program accept array of 10 ints and print sum, using cli
class Add{
	public static void main(String[] args) {
		int sum=0;
		for(String i : args)
			sum+=Integer.parseInt(i);
		System.out.println("Sum="+sum);
	}
}