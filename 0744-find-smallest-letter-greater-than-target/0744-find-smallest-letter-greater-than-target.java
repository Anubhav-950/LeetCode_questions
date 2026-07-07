class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=letters.length;

            for(int i=0; i<l; i++)
            {
                if(Character.compare(target, letters[i]) < 0)
                return letters[i];
            }
        return letters[0];        
    }
}