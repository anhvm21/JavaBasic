package day6;

public class BinaryGap {
	public int solution(int N) {
		int result = 0;

		String convertedInt = Integer.toString(N, 2);
		System.out.println(convertedInt);

		boolean startCounting = false;

		int count = 0;
		//int maxCount = 0;

		for (int i = 0; i < convertedInt.length(); i++) {
			String b = convertedInt.substring(i, i+1);
			// System.out.println(b);
			if (b.equals("1")) {
				if (startCounting) {
					if (count > result) {
						result=count;
					}
				}
				count = 0;
				startCounting = true;
		
			}
			if(b.equals("0")) {
				count++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		BinaryGap s = new BinaryGap();
		System.out.println(s.solution(1056));
		
	}
}
