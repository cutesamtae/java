package class_06;

public class ex06 {
	
	public static int sum(int[] array) {
		int sum = 0;
		for(int i : array) {
			sum += i;
		}
		return sum;
	}
	
	public static void change1(int a) {
		a = 100;
	}
	
	public static void change2(int[] array) {
		array[0] = 100;
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int arraySum = sum(array);
		System.out.println("array배열의 요소의 합 : " + arraySum);
		int a = 1;
		change1(a);
		System.out.println(a);
		change2(array);
		System.out.println(array[0]);
	}

}
