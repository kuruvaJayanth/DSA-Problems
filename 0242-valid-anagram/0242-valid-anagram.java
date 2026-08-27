class Solution {
    public boolean isAnagram(String s, String t) {
        int a = s.length();
        int b = t.length();
        Map < Character, Integer > map = new HashMap<>();
        if(a!=b) {
            return false;
        }
        for(int i=0;i<a;i++) {
            Character s1 = s.charAt(i);
            Character t1 = t.charAt(i);
            map.put(s1, map.getOrDefault(s1,0) + 1);
            map.put(t1, map.getOrDefault(t1,0) - 1);
        }
        for(int i: map.values()) {
            if(i!=0) {
                return false;
            }
        }
        return true;
    }
}