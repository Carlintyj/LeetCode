class MyHashSet {
    private int bucketSize;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        bucketSize = 1000;
        buckets = new LinkedList[bucketSize];
    }

    private int hash(int key) {
        return key % bucketSize;
    }

    public void add(int key) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            buckets[index].removeFirstOccurrence(key);
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index] != null && buckets[index].contains(key);
    }
}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */