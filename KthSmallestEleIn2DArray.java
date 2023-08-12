import java.util.PriorityQueue;

public class KthSmallestEleIn2DArray {

	private static int smallest(int matrix[][], int k) {
		int m = matrix.length;
		int n = matrix[0].length;
		if(k>n*m)return -1;
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int ele[] : matrix) {
			for(int e: ele) {
				minHeap.add(e);
			}
		}
		while(k>1) {
			minHeap.poll();
			k--;
		}
		return minHeap.poll();
	}
	public static void main(String[] args) {
		int matrix[][] = {
				{2,9,11},
				{4,7,1},
				{5,32,10}
		};
		int k = 4;
		System.out.println(smallest(matrix,k));
	}

}
