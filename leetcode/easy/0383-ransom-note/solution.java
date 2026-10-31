class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[]= new int[26];

        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i< ransomNote.length();i++){
            int index = ransomNote.charAt(i)-'a';

            if(arr[index]==0){
                return false;
            }
            arr[index]--;
        }
        return true;
    }
}