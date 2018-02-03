
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("OUTPUT.TXT");
		FileReader fr = new FileReader("INPUT.TXT");
		Scanner scan = new Scanner(fr); 
		String pattern = scan.nextLine();
		String matcher = scan.nextLine();
		int m = 0,j=0;
		int i=0;
		char ch;
		int k=pattern.length();
		int l=matcher.length();
		boolean flag=false;
		while((i<k)&&(j<l)) {
			ch = pattern.charAt(i);
			flag = false;
			while((j<l)&&(!flag)) {
				if (ch==matcher.charAt(j)) {
					flag=true;
					m++;
					j++;
				}else {
					j++;
				}
			}
			i++;
		}
		if (m==k) {fw.write("YES");}else {fw.write("NO");}
		scan.close();
		fr.close();
		fw.close();
	}

}
