package Tree.Trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("API");
        trie.insert("APIS");
        trie.search("APIS");
        trie.delete("APIs");
        trie.search("APIS");
    }
}
