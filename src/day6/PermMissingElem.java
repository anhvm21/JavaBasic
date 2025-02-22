package day6;

import java.util.HashSet;

public class PermMissingElem {
	public int solution(int[] A) {
		int length = A.length;

		HashSet<Integer> Alist = new HashSet<>();
		for (int i = 1; i <= length + 1; i++) {
			Alist.add(i);
		}
		for (int i = 0; i < length; i++) {
			Alist.remove((Integer) A[i]);

		}
		return Alist.iterator().next();

	}

	public static void main(String[] args) {
		PermMissingElem p = new PermMissingElem();
				System.out.println(p.solution(new int[] {2,3,1,5}));
				System.out.println(p.solution(new int[] {0,2,3}));
	}
}
