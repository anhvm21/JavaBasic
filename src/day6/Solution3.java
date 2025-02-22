package day6;

public class Solution3 {
	public int solution(int[] A) {
		int res = 0;
        for(int num : A){
            res = res ^ num;
        }
        return res;
    }
}
