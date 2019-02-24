import java.util.ArrayList;
import java.util.Arrays;


public class Nearby{
    
    
    public static void main(String[] args) {
        int[] result = Nearby( 0,  2,  4);
        System.out.println(Arrays.toString(result));
    }


   	public static int[] Nearby(int x, int y, int range) {
   	    
		int[][] multi = new int[][]{
			{ 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
			{ 1, 3, 5, 7 },
			{ 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
		};

		ArrayList<Integer> nums = new ArrayList<Integer>();			
		for(int i = 0; i <= range; i++){
		    if (i > 0){
    			try{
    				nums.add(multi[x][y-i]);
    			} catch (Exception e) {}
    			try{
    			    nums.add(multi[x][y+i]);
    			} catch (Exception e) {}
		    }
		}
		
		int[] ret = new int[nums.size()];
		for (int i=0; i < ret.length; i++)
		{
		    ret[i] = nums.get(i).intValue();
		}
		 return ret;
	}
}
