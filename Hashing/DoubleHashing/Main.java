package Hashing.DoubleHashing;

public class Main {
    public static void main(String[] args) {
        DoubleHashing doubleHashing = new DoubleHashing(13);
        doubleHashing.insertInHashTable("The");
        doubleHashing.insertInHashTable("quick");
        doubleHashing.insertInHashTable("brown");
        doubleHashing.insertInHashTable("fox");
        doubleHashing.insertInHashTable("over");
        doubleHashing.insertInHashTable("lazy");
        doubleHashing.displayHashTable();
        //doubleHashing.searchHashTable("brown");
        //doubleHashing.deleteKeyHashTable("brown");
        //doubleHashing.searchHashTable("brown");
    }
}
