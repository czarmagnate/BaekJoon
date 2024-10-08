import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] nArr = new int[n];

		for (int i = 0; i < n; i++) {
			nArr[i] = Integer.parseInt(br.readLine());
			for (int j = 0; j < i; j++) {
				int temp = nArr[j];
				if (nArr[i] < nArr[j]) {
					nArr[j] = nArr[i];
					nArr[i] = temp;
				}
			}
		}

		for (int i : nArr) {
			bw.write(i + "\n");
		}

		bw.flush();
		bw.close();
	}
}
