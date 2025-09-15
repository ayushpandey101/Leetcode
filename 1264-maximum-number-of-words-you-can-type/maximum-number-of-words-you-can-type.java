class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> brokenSet = new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            brokenSet.add(c);
        }
        String[] words = text.split(" ");
        int cnt=0;
        for(String word : words){
            boolean canbe = true;
            for(char letter : word.toCharArray()){
                if(brokenSet.contains(letter)){
                    canbe = false;
                    break;
                }
            }
            if(canbe){
                cnt++;
            }
        }
        return cnt;
    }
}