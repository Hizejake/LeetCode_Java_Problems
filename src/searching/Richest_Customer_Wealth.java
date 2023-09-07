package searching;

public class Richest_Customer_Wealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accounts[][] = {
				{1,2,3},
				{3,2,1},
				{1,9,5}
			};
		System.out.println(maximumWealth(accounts));
	}
public static int maximumWealth(int[][] accounts) {
    int max = 0;    
    for(int row = 0;row<accounts.length;row++) {
    	int rowsum = 0;
    	for(int col = 0; col<accounts[row].length;col++)
    		rowsum += accounts[row][col];
    	
    	if(rowsum>max) 
		max = rowsum;
    	
    }
	
	return max;
    }
}
