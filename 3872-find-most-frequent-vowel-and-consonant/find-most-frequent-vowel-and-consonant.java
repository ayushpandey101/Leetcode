class Solution {
    public int maxFreqSum(String s) {
        int[] arr= new int[26];
        for (int i=0; i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
        }

        int vCnt=0;
        int cCnt=0;
        for(int i=0; i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20 ){
                vCnt=Math.max(arr[i],vCnt);
            }else{
                cCnt=Math.max(arr[i],cCnt);
            }
        }
        return vCnt+cCnt; 
    }
}