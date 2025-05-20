//2. Remove the following all elements from the HashMap then verify that its size is zero andinclude once again following elements and check its size(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)
//[ Hint : clear() , size() and put()]
public class HashMapClearAndVerify {
	public static void main(String[] args) {
		Map< Integer,String> hashMap = new HashMap<>();
		// 1. Basic Operations
		// Adding elements
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		hashMap.clear();
		System.out.println("After removing All elements size : "+hashMap.size());
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		System.out.println("After Adding All elements size : "+hashMap.size());
	}

}
