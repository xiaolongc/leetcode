package com.art.top100.c0224;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+carry<10 &&i==digits.length-1){
                digits[i]=digits[i]+carry;
                return digits;
            }

            if( digits[i]+carry==10){
                digits[i]=(digits[i]+carry)%10;
                carry=1;
            }else{
                digits[i]=digits[i]+carry;
                carry=0;
            }
        }
        if(carry>0){
            int[] ints = new int[digits.length+1];
            ints[0]=carry;
            for(int j=0;j<digits.length;j++){
                ints[j+1]=digits[j];
            }
            return ints;
        }
        return digits;
    }
}
