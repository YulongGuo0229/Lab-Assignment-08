public class Judge
{
	public Judge() {
	}

	public static int findJudge (int N, int [][] trust) {
		int[] a = new int[N+1];
		for (int i=0; i<trust.length; i++) {
			int[] tst = trust[i];
			a[tst[0]]--;
			a[tst[1]]++;
		}
		for (int i=0; i<N; ++i) {
			if (a[i+1] == N-1) {
				return i+1;
			}
		}
		return -1;
	}
}