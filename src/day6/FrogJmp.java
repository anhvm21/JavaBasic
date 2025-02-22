package day6;

public class FrogJmp {
	public int solution(int X, int Y, int D) {
		int distance = Y-X;
		int result = (int)Math.ceil(distance/(double)D);
		
		return result;
        // Implement your solution here
    }
	public static void main(String[] args) {
		FrogJmp f = new FrogJmp();
				System.out.println(f.solution(10,85,30));
				System.out.println(f.solution(1,1,30));

	}
}
