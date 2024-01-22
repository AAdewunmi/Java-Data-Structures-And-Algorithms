package Tree.Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character, TrieNode> children;
    boolean endOfString;

    public TrieNode() {
        this.children = new HashMap<>();
        this.endOfString = false;
    }
}
