
public class Book {
	private int BOOKID;
	private String BOOKNAME;
	private String PUBLISHER;
	private int PRICE;
	
	public  Book(int BOOKID, String BOOKNAME, String PUBLISHER, int PRICE) {
		this.BOOKID= BOOKID;
		this.BOOKNAME= BOOKNAME;
		this.PUBLISHER= PUBLISHER;
		this.PRICE= PRICE;
	}

	public int getBOOKID() {
		return BOOKID;
	}

	public String getBOOKNAME() {
		return BOOKNAME;
	}

	public String getPUBLISHER() {
		return PUBLISHER;
	}

	public int getPRICE() {
		return PRICE;
	}
	
	void printBook() {
		System.out.println("\t"+  BOOKID
							+ "\t"+ BOOKNAME
							+ "\t"+ PUBLISHER
							+ "\t"+ PRICE
							+ "\n");
	}	
}
