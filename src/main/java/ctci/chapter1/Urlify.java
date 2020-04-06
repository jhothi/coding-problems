package ctci.chapter1;

/**
 * Only approach comes to mind is to start from the end and move characters to the back of the array one by end (N)
 */
public class Urlify {

    /**
     * @param url A string with extra padding at the end to hold enough spaces in a char array for the extra characters.
     * @param trueSize The real size of the string including spaces.
     * @return A new String based on a modified in place character array of url.
     */
    public String urlify(String url, int trueSize) {
        final char[] chars = url.toCharArray();
        int endIndex = chars.length - 1;
        for (int i = trueSize - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[endIndex] = '0';
                chars[--endIndex] = '2';
                chars[--endIndex] = '%';
                endIndex--;
            } else {
                chars[endIndex] = chars[i];
                endIndex--;
            }
        }
        return new String(chars);
    }
}
