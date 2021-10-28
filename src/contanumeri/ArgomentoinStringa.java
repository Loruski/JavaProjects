package contanumeri;

public class ArgomentoinStringa {

	public static void main(String[] args) {
		String x=args[0];
		
		char [] s= new char [x.length()];
		
		for (int c=0; c < x.length() ; c++) {
			s[c]= x.charAt(c);
		}
		
		for (int i=0; i< s.length; i++) {
			System.out.print(s[i]);
		}

	}

}
