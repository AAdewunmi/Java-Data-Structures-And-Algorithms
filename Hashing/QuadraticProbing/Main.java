package Hashing.QuadraticProbing;

public class Main {

    public static void main(String[] args) {
        QuadraticProbing quadraticProbing = new QuadraticProbing(13);
        quadraticProbing.insertInHashTable("The");
        quadraticProbing.insertInHashTable("quick");
        quadraticProbing.insertInHashTable("brown");
        quadraticProbing.insertInHashTable("fox");
        quadraticProbing.insertInHashTable("over");
        quadraticProbing.insertInHashTable("lazy");
        quadraticProbing.displayHashTable();
        quadraticProbing.searchHashTable("brown");
        quadraticProbing.deleteKeyHashTable("brown");
        quadraticProbing.searchHashTable("brown");
    }

}
