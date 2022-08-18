package training_Lecture_18;

interface StringFunction {
	String run(String str);
}

public class Main {
	public String index(int[]a, int L) {
		int temp=0;
		int[] sortedArray = new int[a.length];
		for(int i=0; i<a.length;i++) {
		}
		return "";
	}
	public static void main(String[] args) {
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);
	}

	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}
}