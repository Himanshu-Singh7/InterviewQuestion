package InternalWorkingOfHashMap;

import java.util.Map;
/*------Internal working of Hash Map*/

/* HashMap uses HashTable implemetation internally and 
 * consist of two Data structures which are LinkedList and Array
 * There are a bucket of Array with each elemet reperesting an individual LinkedList.
 * The Inner Node class consist of a hash value ,Key,Value ,and the link to the Next Node*/

static class Node<K , V> implements Map.Entry<K,V> {

	
	final int hash;
	final k Key;
	V value ;
	Node<K, V> next;
	
	public Node(int hash, k key, V value, Node<K, V> next) {
		super();
		this.hash = hash;
		Key = key;
		this.value = value;
		this.next = next;
	}

}
