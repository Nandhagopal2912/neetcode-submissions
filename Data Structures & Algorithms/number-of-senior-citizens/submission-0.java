class Solution {
    public int countSeniors(String[] details) {
        int res =0;
        int n =15;
        for(String s : details){
            int age = (s.charAt(n-4)-'0')*10;
            age+=(s.charAt(n-3)-'0');

            if(age>60) res++;
        }

        return res;
    }
}