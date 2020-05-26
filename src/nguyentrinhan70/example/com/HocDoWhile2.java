package nguyentrinhan70.example.com;

public class HocDoWhile2 {

	public static void main(String[] args) {

		int i =1;
		int n =1;
		do {
			n*=i;
			i++;
			if(i>5)
				break;
		}while (true);
		System.out.println("5!="+ n);
	}

}
