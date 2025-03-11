package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test_1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Set resultSet = new HashSet();
		for (int i = 0; i < n; i++) {
			resultSet.add(br.readLine());
		}
		System.out.println(resultSet);
		List resultList = new ArrayList(resultSet);
		Collections.sort(resultList);

	}

	/* Java는 Length 기준으로 Sort하려면 Comparator 사용해야됨
	public static void main(String args[]) throws IOException{
	   	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   	 
	   	 	int num = Integer.parseInt(br.readLine());
	   	 	
	   	 	String[] arr = new String[num];
	   	 	
	   	 	for(int i =  0 ; i < num ; i++) {
	   	 		arr[i] = br.readLine();
	   	 	}
	   	 	
	   	 	Arrays.sort(arr, new Comparator<String>() {
	   	 		@Override
	   	 		public int compare(String s1, String s2) {
	   	 		if(s1.length() == s2.length()) {
	   	 			return s1.compareTo(s2);
	   	 		}else {
	   	 			return s1.length() - s2.length();
	   	 		}
	   	 		
	   	 	}
	   	 	});
	   
	   	 	System.out.println(arr[0]);
	   	 	for(int i = 1; i < num; i++) {
	   		if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}
	*/
	
}
