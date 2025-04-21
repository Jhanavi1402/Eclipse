import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
public class CeaserCipher {
	static Scanner sc=new Scanner(System.in);
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String [] args)throws IOException{
		System.out.println("enter any String:");
		String str=br.readLine();
		System.out.println("enter key:");
		int key=sc.nextInt();
		String encrypted=encrypt(str,key);
		System.out.println("\nencrypted:"+encrypted);
		String decrypted= decrypt(encrypted,key);
		System.out.println("\ndecrypted:"+decrypted);
	}
public static String encrypt(String str,int key){
	String encrypted="";
		for(int i=0;i<str.length();i++) {
			int c=str.charAt(i);
			if(Character.isUpperCase(c)) {
				c=c+(key%26);
				if (c>'Z')
					c=c-26;
			}
			else if(Character.isLowerCase(c)) {
				c=c+(key%26);
				if (c>'z')
					c=c-26;
			}
			encrypted +=(char)c;
		}
		return encrypted ;
		
	}
public static String decrypt(String str,int key){
String decrypted="";
	for(int i=0;i<str.length();i++) {
		int c=str.charAt(i);
		if(Character.isUpperCase(c)) {
			c=c-(key%26);
			if (c<'A')
			c=c+26;
			}
		else if(Character.isLowerCase(c)) {
			c=c-(key%26);
			if (c<'a')
			c=c+26;
		}
			decrypted+=(char)c;
		}
		return decrypted;
		
	}
}