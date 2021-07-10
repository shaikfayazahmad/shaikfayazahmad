package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		//Map<String,String> map=new TreeMap<>((obj1,obj2)->{return obj2.compareTo(obj1);});
		
		map.put("mykey1", "my value 11111111111");
		map.put("mykey2", "my value 22222222222");
		map.put("mykey3", "my value 33333333333");
		System.out.println(map);
		
		System.out.println(map.get("mykey1"));
		
		Set<Map.Entry<String,String>> set= map.entrySet();
		
		Iterator<Map.Entry<String,String>> iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String,String> me=iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
	}

}
