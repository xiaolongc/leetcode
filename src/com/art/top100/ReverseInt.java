package com.art.top100;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(214748366));
    }

    public static int reverse(int x) {
        int result = 0;
        while(x!=0) {
            int last = x%10;
            if (result>214748364 || (result==214748364 && last>7) || result<-214748364 || (result==-214748364 && last<-8)) {
                return 0;
            }
            result = result*10 + last;
            x = x/10;
        }
        return result;
    }


}
