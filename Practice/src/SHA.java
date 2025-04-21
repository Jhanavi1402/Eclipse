import java.security.MessageDigest;
public class SHA {
	public static void main(String[] args)throws Exception {
		MessageDigest md=MessageDigest.getInstance("SHA");
		System.out.println("MessageDigest info:");
		System.out.println("\nAlgorithm:"+md.getAlgorithm());
		System.out.println("\nProvider:"+md.getProvider());
		System.out.println("\nString:"+md.toString());
		
		String input="";
		md.update(input.getBytes());
		byte[] output=md.digest();
		System.out.println("SHA("+input+")="+bytes2hex(output));
		input="abc";
		md.update(input.getBytes());
		output=md.digest();
		System.out.println("SHA("+input+")="+bytes2hex(output));
		input="abcdefghijklmnopqrstuvwxyz";
		md.update(input.getBytes());
		output=md.digest();
		System.out.println("SHA("+input+")="+bytes2hex(output));
	}
	public static String bytes2hex(byte b[]) {
		StringBuffer buf=new StringBuffer(b.length*2);
		for(int i=0;i<b.length;i++) {
			if(((int)b [i] & 0xff)<0x10)
				buf.append("0");
			buf.append(Long.toString((int)b[i]&0xff,16));
		}
		return buf.toString().toUpperCase();
	}	
}	
		
		
		
		
	
