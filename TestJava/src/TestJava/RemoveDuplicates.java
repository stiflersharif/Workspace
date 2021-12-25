package TestJava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,14,7,3,7,14,7,3};
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<3;i++) {
			int x=0;
			if(i==0) {
				x=3;
			}
			else if(i==1) {
				x=7;
			}
			else {
				x=14;
			}
			int k =map.get(x);
			for(int j=0;j <k ;j++) {
				list.add(x);
			}
		}
		
		System.out.println(list);
		
	}

}
