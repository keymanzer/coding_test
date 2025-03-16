import java.io.*;
import java.util.*;

public class Test_4659 {
	public static void main(String[] args) throws IOException {
		HashSet<Character> vowelSet = new HashSet<>(Arrays.asList('a','e','i','o','u'));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String s = br.readLine();  // 사용자 입력 받기

            // StringTokenizer로 단어 분리
            StringTokenizer st = new StringTokenizer(s);
            String word = st.nextToken();

			// 종료 조건
			if(word.equals("end")) {
			    break;
			}
	                
			// 단어에 모음이 1개 미만인 경우
			int cnt = 0;
			for (char w : word.toCharArray()) {
				if(vowelSet.contains(w)) {
					cnt += 1;
					break;
				}
			}
			if(cnt < 1) {
		        System.out.println("<"+word+">"+" is not acceptable."); 
		        continue;
			}
		    // 모음이 3개 혹은 자음이 3개 연속으로오면 안됨
			cnt = 0;
			for (int i = 0; i < word.length()-2; i++) {
				if ( (vowelSet.contains(word.charAt(i))) && (vowelSet.contains(word.charAt(i+1))) && (vowelSet.contains(word.charAt(i+2))) )  {
					cnt += 1;
					break;
				}
				else if ( (!vowelSet.contains(word.charAt(i))) && (!vowelSet.contains(word.charAt(i+1))) && (!vowelSet.contains(word.charAt(i+2))) )  {
					cnt += 1;
					break;
				}
			}
			if(cnt == 1) {
		        System.out.println("<"+word+">"+" is not acceptable."); 
		        continue;
			}
			
			// 같은 글자가 연속적으로 두번 오면 안되나, ee와 oo는 허용한다
			cnt = 0;
			for (int i = 0; i < word.length()-1; i++) {
				if(word.charAt(i) == word.charAt(i+1)) {
					if ( ((word.charAt(i) == 'e') && (word.charAt(i+1) == 'e')) || ((word.charAt(i) == 'o') && (word.charAt(i+1) == 'o')) ) {
						continue;
					}
					cnt += 1;
					break;
				}
			}
			if(cnt == 1) {
		        System.out.println("<"+word+">"+" is not acceptable."); 
		        continue;
			}
				
			// 모든 예외 케이스 통과하면 적합
	        System.out.println("<"+word+">"+" is acceptable."); 

		}
		
	}
}