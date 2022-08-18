package training;

public class xyz {
	public int a;
	public static byte shortTobyte(short s) {
		byte value = 0;
		while (s != 0) {
			if (s > 0) {
				if (value == 127) {
					value = -128;
				} else {
					value++;
				}
				s--;
			} else {
				if (value == -128) {
					value = 127;
				} else {
					value--;
				}
				s++;

			}
		}
		return value;
	}
	
	public static void MultiTable(int i, int j) {
		for(int a = 1; a<=j;a++) {
			System.out.println(i+" * "+a+" = "+a*i);
		}
	}

	public static void main(String[] args) {
		byte b = 2;
		short s = -32768;
		b = (byte) s; // Down Casting
		System.out.println(b);
		System.out.println(shortTobyte(s));
		MultiTable(15,17);

		
	}

}
