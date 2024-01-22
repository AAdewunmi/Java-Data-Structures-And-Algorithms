package DivideAndConquerAlgorithms.LongestPalindromicProblem;

public class LongestPalindormicSubsequence {
    private int findLPSLength(String st, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        }
        if (startIndex == endIndex) {
            return 1;
        }

        int count1 = 0;
        if (st.charAt(startIndex) == st.charAt(endIndex)) {
            count1 = 2 + findLPSLength(st, startIndex+1, endIndex-1);
        }
        int count2 = findLPSLength(st, startIndex+1, endIndex);
        int count3 = findLPSLength(st, startIndex, endIndex-1);

        return Math.max(count1, Math.max(count2, count3));
    }

    public int findLPSLength(String st) {
        return findLPSLength(st, 0, st.length()-1);
    }
}
