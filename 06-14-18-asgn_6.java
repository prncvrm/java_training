//variable size argument//
class Variable {
	void showListItems(int... param){
		for(int i : param)
			System.out.println(i);
	}
}
class Test{
	public static void main(String[] args) {
		Variable ob = new Variable();
		ob.showListItems();
		System.out.println("---------------");
		ob.showListItems(100);
		System.out.println("---------------");
		ob.showListItems(1,2,3,4,5);
		System.out.println("---------------");
		int []arr = {10,20,30,40};
		ob.showListItems(arr);
	}
}