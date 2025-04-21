import java.io.*;
import java.util.*;
public class Subs {
	static Scanner sc=new Scanner(System.in);
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException{
		String a="abcdefghijklmnopqrstuvwxyz";
		String b="zyxwvutsrqponmlkjihgfedcba";
		System.out.println("enter any message:");
		String str=br.readLine();
		String decrypt="";
		int c;
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			int j=a.indexOf(c);
			decrypt=decrypt+b.charAt(j);
		}System.out.println("encrypted text:"+decrypt);
		
	}

}
