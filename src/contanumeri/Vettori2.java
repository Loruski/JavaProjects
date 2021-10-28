package contanumeri;

public class Vettori2 {
	public static void main(String[] args) {
		int [] X= new int [51];
		int [] Y= new int [51];
		int [] Z= new int [51];
		for (int x=0, y=0; x<=50; x++, y++) {
			X[x]=x;
			Y[x]=y;
			Z[x]=x+y;
		}
		for (int x=0;x<=50;x++) {
			System.out.println("X: "+X[x]+" Y: "+Y[x]+" Z: "+Z[x]);
		}
	}

}
