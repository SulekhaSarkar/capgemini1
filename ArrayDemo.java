
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,4,5};
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("array :"+ar[i]);
		}
		for (int i : ar) {
			System.out.println(i);
		}
		
		int[][] jaggu= {{1,2},{3,4,5},{6,7,8,9}};
		for (int j = 0; j < jaggu.length; j++) {
			for (int k = 0; k < jaggu[j].length; k++) {
				System.out.println(jaggu[j][k]);
			}
		}
	}

}
