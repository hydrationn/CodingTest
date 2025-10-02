class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for (int i = 0; i < dic.length; i++) {
            boolean targetLanguage = true;
            
            for (int j = 0; j < spell.length; j++) {
                if (!dic[i].contains(spell[j])) {
                    targetLanguage = false;
                    break;
                }
            }

            if (targetLanguage && dic[i].length() == spell.length) {
                return 1;
            }
        }

        return 2;
    }
}