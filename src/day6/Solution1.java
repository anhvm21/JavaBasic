package day6;

class Solution1 {

	public int[] solution(int[] A, int K) {

		int length = A.length;
		int[] arranged_arr = new int[length];

		if (length == 0) return arranged_arr;

		K = K % length;

		int new_pos = 0;
		for (int i = length - K; i < length; i++) {
			arranged_arr[new_pos++] = A[i];
		}
		for (int i = 0; i < length-K; i++) {
			arranged_arr[new_pos++] = A[i];
		}
		return arranged_arr;

	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.solution(new int[] { 1, 2, 3, 4 }, 3));

	}
}
