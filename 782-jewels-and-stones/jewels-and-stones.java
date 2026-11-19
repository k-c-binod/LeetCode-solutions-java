class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> list = new HashSet<>();

        for(int i = 0; i<jewels.length(); i++ ) {
            list.add(jewels.charAt(i));
        }
        int count = 0;

        for(int i=0;i<stones.length(); i++) {
            if(list.contains(stones.charAt(i))) {
                count ++;
            }
        }

        return count;
        
    }
}