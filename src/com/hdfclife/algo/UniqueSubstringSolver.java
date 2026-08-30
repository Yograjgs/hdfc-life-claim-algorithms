package com.hdfclife.algo;

import java.util.HashSet;

public class UniqueSubstringSolver {

    public static int longestUniqueSubstring(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int maxLength=0;

        for(int right=0;right<s.length();right++){
            char currentCharacter=s.charAt(right);

            while(set.contains(currentCharacter)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentCharacter);
            int currentLength=right-left-1;

            if(currentLength>maxLength)
            {
                maxLength=currentLength;
            }
        }

        return maxLength;
    }
}
