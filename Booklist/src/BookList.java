
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookList {
	Connection con; // 1. �������
	Statement stmt;
	ResultSet rs;
	
	// 1. ����� ����
//	int BOOKID;
//	String BOOKNAME;
//	String PUBLISHER;
//	int PRICE;
	
	// 2. �迭
//	int BOOKIDArr[];
//	String BOOKNAMEArr[]= new String[14];
//	String PUBLISHERArr[]= new String[14];
//	int PRICEArr[]= new int[14];
	
	// 3. ��ü
//	Book bookObj;
	
	// 4. ��ü �迭
	private Book bookArr[];
	
	// 2.������
	BookList() {
		// 2. �迭
//		BOOKIDArr= new int[12]; //�迭�� �ʱ�ȭ�� �����ڿ��� �Ѵ���(���� ��������)
//		BOOKNAMEArr= new String[14];
//		PUBLISHERArr= new String[14];
//		PRICEArr= new int[14];
//		
//		bookObj= new Book(); // ���� �ƴ�!
		
		// 4. ��ü �迭 �ʱ�ȭ
		bookArr= new Book[14];
	}
	
	// 3.�޼���
	void getConnection() {
		String url= "jdbc:oracle:thin:@localhost:1521:xe"; // ����Ŭ ����â ����
		String userid= "madang"; // ver21 c## �߰�
		String pwd= "madang"; // ver21 c## �߰�
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("�����ͺ��̽� ���� �غ� ...");
			con= DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	void getBook() { // ������
		String query= "SELECT BOOKID, BOOKNAME, PUBLISHER, PRICE FROM BOOK";
		try {
			stmt= con.createStatement(); // 2
			rs= stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \tPUBLISHER \tPRICE");
			int i=0;
			while (rs.next()) {
//				System.out.println( rs.getInt(1));
//				System.out.println("\t\t\t"+ rs.getString(2));
//				System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+ rs.getString(3));
//				System.out.println("\t\t\t\t\t\t\t\t\t\t"+ rs.getInt(4));
				
				// 1.����
//				BOOKID= rs.getInt(1);
//				BOOKNAME= rs.getString(2);
//				PUBLISHER= rs.getString(3);
//				PRICE= rs.getInt(4);
				
//				printBook(BOOKID, BOOKNAME, PUBLISHER, PRICE);
				
				// 2.�迭		
//				BOOKIDArr[i]= rs.getInt(1);
//				BOOKNAMEArr[i]= rs.getString(2);
//				PUBLISHERArr[i]= rs.getString(3);
//				PRICEArr[i]= rs.getInt(4);
//				i++;
				
				// 3.��ü
//				Book bookObj = new Book(rs.getInt(1),
//								  rs.getString(2),
//								  rs.getString(3),
//								  rs.getInt(4));
//				
//				printObj(bookObj);
				
				// 4.��ü �迭
				bookArr[i]= new Book(rs.getInt(1),
						  			rs.getString(2),
						  			rs.getString(3),
						  			rs.getInt(4));
				i++;		
			}	
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void printObj(Book bookObj) {
		// TODO Auto-generated method stub
		
	}

	public Book[] getBookArr() {
		return bookArr;
	}
	
//	public void setBookArr(Book[] bookArr) {
//		this.bookArr= bookArr;
//	}
	// 1.������
//	void printBook(int BOOKID, String BOOKNAME, String PUBLISHER, int PRICE) {
//		System.out.println("\t"+  BOOKID
//							+ "\t"+ BOOKNAME
//							+ "\t"+ PUBLISHER
//							+ "\t"+ PRICE
//							+ "\n");
//	}
	
	// 2.�迭 ��¿�
//	void printBookArr( ) {
//		for(int i=0; i< BOOKIDArr.length; ++i) 
//			System.out.println("\t"+  BOOKIDArr[i]
//					+ "\t"+ BOOKNAMEArr[i]
//					+ "\t"+ PUBLISHERArr[i]
//					+ "\t"+ PRICEArr[i]);
//	}
	
	// 3.��ü ��¿�
//	void printObj(Book, book ) {
//		System.out.println("\t"+ book.BOOKID
//						+ "\t"+ book.BOOKNAME
//						+ "\t"+ book.PUBLISHER
//						+ "\t"+ book.PRICE
//						+"\n");
//		}
//	}
	
	// 4.��ü �迭 ��¿� => Book Ŭ���� ����������
	void printObjArr() {
		for(int i= 0; i< bookArr.length; i++) {
			
//			System.out.println("\t"+ bookArr[i].BOOKID
//								+ "\t"+ bookArr[i].BOOKNAME
//								+ "\t"+ bookArr[i].PUBLISHER
//								+ "\t"+ bookArr[i].PRICE
//								+ "\n");;
			
//			System.out.println("\t"+ bookArr[i].getBOOKID
//								+ "\t"+ bookArr[i].getBOOKNAME
//								+ "\t"+ bookArr[i].getPUBLISHER
//								+ "\t"+ bookArr[i].getPRICE
//								+ "\n");;

		}
	}
//	public static void main(String args[]) { // �޼����̸鼭 ���α׷����࿡ ������
//		BookList so= new BookList();
//		so.sqlRun();
//	}
}

