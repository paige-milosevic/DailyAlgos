

class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i=1; i < strs.length; i++) {
            String str = strs[i];

            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }

        return prefix;
    }


    public static void main(String[] args) {
        
        LongestCommonPrefix test = new LongestCommonPrefix();

        String[] x = {"flower", "flair", "flow"};
        String[] y = {"zebra", "zero", "zealous"};
        String[] z = {"chair", "change", "challenge"};

        System.out.println(test.longestCommonPrefix(x));
        System.out.println(test.longestCommonPrefix(y));
        System.out.println(test.longestCommonPrefix(z));
        

    }
}