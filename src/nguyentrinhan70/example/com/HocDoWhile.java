package nguyentrinhan70.example.com;

public class HocDoWhile {

	public static void main(String[] args) {

		int i =1;
		int n =1;
		do {
			n*=i;
			i++;
		}while (i<=5);
		System.out.println("5!="+ n);
	}

}
