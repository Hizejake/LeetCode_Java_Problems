package searching;

public class Find_Smallest_Letter_Greater_Than_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []letters = {'c','f','j'};
		char target = 'k';
		System.out.println(nextGreatestLetter(letters, target));
		
	}
	
	static char nextGreatestLetter(char[] letters, char target) {
	int start = 0;
	int end = letters.length-1;
	
	while(start<=end) {
		
		int mid = start + (end-start)/2;
		
		if(target < letters[mid]) end = mid-1;
			
		else start = mid+1;
    }
	
	return letters[start % letters.length];

}
}
