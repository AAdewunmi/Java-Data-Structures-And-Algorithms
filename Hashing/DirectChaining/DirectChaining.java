package Hashing.DirectChaining;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String> [] hashtable;
    int maxChainSize = 5;

    public DirectChaining(int size) {
        this.hashtable = new LinkedList[size];
        System.out.println("Created Hash Table");
    }

    public int modASCIIHashFunction(String word, int M){
        char ch[];
        ch = word.toCharArray();
        int i = 0, sum;
        for (sum = 0; i < word.length(); i++) {
            sum += ch[i];
        }
        return sum % M;
    }

    public void insertHashTable(String word){
        int newIndex = modASCIIHashFunction(word, hashtable.length);
        if (hashtable[newIndex] == null) {
            hashtable[newIndex] = new LinkedList<>();
            hashtable[newIndex].add(word);
        }else {
            hashtable[newIndex].add(word);
        }
    }

    public void displayHashTable(){
        if (hashtable == null) {
            System.out.println("\nHashTable does not exist!");
            return;
        } else {
            System.out.println("\n---------------HashTable ---------------");
            for (int i = 0; i < hashtable.length; i++) {
                System.out.println("Index " + i + ", key: " + hashtable[i]);
            }
        }
    }

    public boolean searchHashTable(String word){
        int newIndex = modASCIIHashFunction(word, hashtable.length);
        if (hashtable[newIndex] != null && hashtable[newIndex].contains(word)) {
            System.out.println("\n" + "\"" + word + "\"" + " found in Hashtable at location: " + newIndex);
            return true;
        } else {
            System.out.println("\n" + "\"" + word + "\"" + " not found in Hashtable: " + newIndex);
            return false;
        }
    }

    public void deleteKeyHashTable(String word){
        int newIndex = modASCIIHashFunction(word, hashtable.length);
        boolean result = searchHashTable(word);
        if (result == true) {
            hashtable[newIndex].remove(word);
            System.out.println("\n" + "\"" + word + "\"" + " deleted from Hashtable at location: " + newIndex);
        }else {
            System.out.println("\n" + "\"" + word + "\"" + " not found in Hashtable: " + newIndex);
        }
    }
}
