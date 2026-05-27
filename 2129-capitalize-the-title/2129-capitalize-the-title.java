class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words) {
            if(word.length() <= 2) {
                res.append(word);
            } else {
                res.append(Character.toUpperCase(word.charAt(0)))
                   .append(word.substring(1));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
}