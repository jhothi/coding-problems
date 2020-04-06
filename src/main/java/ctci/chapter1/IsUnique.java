package ctci.chapter1;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    public boolean isUnique(String s) {
        final char[] chars = s.toCharArray();
        final Set<Character> characterSet = new HashSet<>();
        for (char c: chars) {
            characterSet.add(c);
        }
        return characterSet.size() == s.length();
    }

    public boolean isUniqueWithoutExtraSpace(String s) {
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) return false;
            }
        }
        return true;
    }
}
