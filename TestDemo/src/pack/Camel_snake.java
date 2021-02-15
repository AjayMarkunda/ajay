package pack;

import java.util.Scanner;

//import java.lang.*;
public class Camel_snake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String aj = sc.nextLine();
		int count = -1;
		char[] b = new char[1000];
		char[] a = aj.toCharArray();
		int r = 0;
		for (int i = 0; i < aj.length(); i++) {
			if (i == 0) {
				for (int k = 65; k <= 90; k++) {
					if (a[i] == (char) k) {
						r = k + 32;
						b[i] = (char) r;
						break;
					}
					r = k + 32;
					if (a[i] == (char) r) {
						b[i] = (char) r;
						break;
					}
				}

			}

			if (i > 0) {
				count++;
				for (int j = 65; j <= 90; j++) {
					if (a[i] == (char) j) {
						count++;
						b[count] = '_';
						count++;
						r = j + 32;
						b[count] = (char) r;
						break;
					}
					r = j + 32;
					if (a[i] == (char) r) {
						count++;
						b[count] = (char) r;
						break;
					}

				}
			}
		}
		for (int n = 0; n <= count; n++) {
			System.out.print(b[n]);
			// System.out.print("\b");
		}
		sc.close();
	}

}
