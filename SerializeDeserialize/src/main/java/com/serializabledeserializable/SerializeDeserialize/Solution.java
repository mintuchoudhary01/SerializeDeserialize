package com.serializabledeserializable.SerializeDeserialize;
import java.util.*;

class Solution {
   /* String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
            
        }
       
        char best_char = 'a';
        int  best_res  = 0;
       
        for (int i = 1; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }
        

        return Character.toString(best_char);
      //  return Character.toString(s.charAt(0));
    }
    public static void main(String[] args) {
		Solution s1 = new Solution();
		System.out.println(s1.solution("dddddddccccccc"));
		
	}*/
	
	 public String solution(int AX, int AY, int BX, int BY) {

		 	
		 String ret="";
		 if(BY > 0) {
			 BX -=1;
		 }
		 else
		 {
			 BX=+1;
		 }
		 ret=""+BX+",";
		 
		 
		 if(BY<0){
			 ret +=BY; 
		 }
		 else{
			 ret +=AX;
		 }
		 return ret; 
	    }
	  public static void main(String[] args) {
			Solution s1 = new Solution();
			System.out.println(s1.solution(2,2,2,-3));
			System.out.println(s1.solution(-1,3,3,1));
			
			 
			
		}
}