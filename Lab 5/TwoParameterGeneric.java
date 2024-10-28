// Two Parameter Generic Class
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class TwoParameterGeneric {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30); // Autoboxing of int to Integer
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());

        // Demonstrating auto-unboxing
        int ageValue = pair.getValue(); // Auto-unboxing from Integer to int
        System.out.println("Auto-unboxed age: " + ageValue);
    }
}