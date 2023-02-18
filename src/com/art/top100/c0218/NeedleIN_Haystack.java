package com.art.top100.c0218;

public class NeedleIN_Haystack {
    public int strStr(String haystack, String needle) {
        int result = -1;
        int i = 0,j = 0;
        while(i<haystack.length()&& j<needle.length()){
            if (needle.charAt(j)==haystack.charAt(i)){
                if (j==needle.length()-1 && (result == -1 || result>i-j)){
                    result = i-j;
                    j=0;
                }
                j++;
                i++;
            }else{
                if (j!=0){
                    i=i+1-j;
                    j=0;
                }else {
                    i++;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        NeedleIN_Haystack needle = new NeedleIN_Haystack();
        System.out.println(needle.strStr("mississippi","issip"));
    }

}
