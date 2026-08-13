class Solution {
    public boolean rotateString(String s, String goal) {
        String doubled = s + s;
        for(int i=s.length()-1;i>=0;i--) {
            if(s.length() != goal.length()){
                return false;
            }
            if(doubled.contains(goal)){
                return true;
            }
        }
        return false;
        
    }
}