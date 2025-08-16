class Solution {
    public int maximum69Number (int num) {
       char[] str= String.valueOf(num).toCharArray();
       for(int i=0;i<str.length;i++){
        if(str[i]=='6'){
            str[i]='9';
            break;
        }
       }
       return Integer.parseInt(new String(str));
    }
}