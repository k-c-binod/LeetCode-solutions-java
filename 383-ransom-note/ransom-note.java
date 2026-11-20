class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i = 0;i<ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<magazine.length(); i++) {
            char c = magazine.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        for(char ch : map1.keySet()) {
            if(!map2.containsKey(ch) || map1.get(ch) > map2.get(ch)) {
                return false;
            }
        }
        return true;


    }
}