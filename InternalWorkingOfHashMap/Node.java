package InternalWorkingOfHashMap;

import java.util.Map;
/*------Internal working of Hash Map*/

/* HashMap uses HashTable implemetation internally and 
 * consist of two Data structures which are LinkedList and Array
 * There are a bucket of Array with each elemet reperesting an individual LinkedList.
 * The Inner Node class consist of a hash value ,Key,Value ,and the link to the Next Node*/

public class Node<K , V> implements Map.Entry<K,V> {

	
	final int hash;
	final K Key;
	V value ;
	Node<K, V> next;
	
	public Node(int hash, K key, V value, Node<K, V> next) {
		super();
		this.hash = hash;
		Key = key;
		this.value = value;
		this.next = next;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V setValue(V value) {
		// TODO Auto-generated method stub
		return null;
	}

}
