public class day_06 {
    public static void main(String[] args) {
		int column;
	    int row;
		for(column=0;column<5;column++) {
			for(row=0; row<5; row++) {
				int number = 5*column+row+1;
				System.out.print(number+"\t");
			}
			System.out.println();
		}
    }
}