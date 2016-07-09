
public class PrintPattern {
	public static void main(String[] args) {
		int i, j, k, n;
		n = 10;
		k = 5;
		System.out.println("Printing pattern using FOR Loop!!!");
		System.out.println();
		//using for loop
		for (i=1; i<n; i++){
			if (i<=n/2){
				for (j=1; j<=i; j++){
					System.out.print(j);
				} //for j loop ends
				System.out.println();
			} //if ends
			else {
				for (j=1; j<k; j++){
					System.out.print(j);
				} //for j loop ends
				System.out.println();
				k--;
			} //else loop ends
		} //for i loop ends
		
		//using while loop
		k = 5;
		i = 1;
		System.out.println();
		System.out.println("Printing pattern using WHILE Loop!!!");
		System.out.println();
		
		while (i<n){
			if (i<=n/2){
				j = 1;
				while (j <= i){
					System.out.print(j);
					j++;
				} //while j ends		
				System.out.println();
			} //if ends
			else {
				j = 1;
				while (j<k){
					System.out.print(j);
					j++;
				}//while j ends
				System.out.println();
				k--;
			} //else loop ends
			i++;
		} //while i loop ends
		
		//using do while loop 
		k = 5;
		i = 1;
		System.out.println();
		System.out.println("Printing pattern using DO WHILE Loop!!!");
		System.out.println();
		
		do {
			if (i<=n/2){
				j = 1;
				do {
					System.out.print(j);
					j++;
				} while (j <= i);//do ends		
				System.out.println();
			} //if ends
			else {
				j = 1;
				do {
					System.out.print(j);
					j++;
				}while (j<k); //do ends
				System.out.println();
				k--;
			} //else loop ends
			i++;
		} while (i<n); //main do loop ends
		
	} // main ends

} //PrintPattern ends
