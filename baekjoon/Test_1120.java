import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1120 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int min_cnt = 100;
		for (int j=0; j<b.length()-a.length()+1; j++) {
			int cnt = 0;
			for (int i=0; i<a.length(); i++) {
				if (b.charAt(j+i) != a.charAt(i)) {
					cnt += 1;
				}
			}
			if (cnt<min_cnt) {
				min_cnt = cnt;
			}
		}
		System.out.println(min_cnt);

	}

}