class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            chars[index++] = chars[i];
            if (count > 1) {
                char[] countChars = String.valueOf(count).toCharArray();
                for (char c : countChars) {
                    chars[index++] = c;
                }
            }
        }
        
        return index;
    }
}

