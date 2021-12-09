
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookList {
	Connection con; // 1. 멤버변수
	Statement stmt;
	ResultSet rs;
	
	// 1. 저장용 변수
//	int BOOKID;
//	String BOOKNAME;
//	String PUBLISHER;
//	int PRICE;
	
	// 2. 배열
//	int BOOKIDArr[];
//	String BOOKNAMEArr[]= new String[14];
//	String PUBLISHERArr[]= new String[14];
//	int PRICEArr[]= new int[14];
	
	// 3. 객체
//	Book bookObj;
	
	// 4. 객체 배열
	private Book bookArr[];
	
	// 2.생성자
	BookList() {
		// 2. 배열
//		BOOKIDArr= new int[12]; //배열의 초기화는 생성자에서 한댜ㅣ(변수 마찬가지)
//		BOOKNAMEArr= new String[14];
//		PUBLISHERArr= new String[14];
//		PRICEArr= new int[14];
//		
//		bookObj= new Book(); // 여기 아님!
		
		// 4. 객체 배열 초기화
		bookArr= new Book[14];
	}
	
	// 3.메서드
	void getConnection() {
		String url= "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클 연결창 참고
		String userid= "madang"; // ver21 c## 추가
		String pwd= "madang"; // ver21 c## 추가
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("데이터베이스 연결 준비 ...");
			con= DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	void getBook() { // 생성자
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
				
				// 1.변수
//				BOOKID= rs.getInt(1);
//				BOOKNAME= rs.getString(2);
//				PUBLISHER= rs.getString(3);
//				PRICE= rs.getInt(4);
				
//				printBook(BOOKID, BOOKNAME, PUBLISHER, PRICE);
				
				// 2.배열		
//				BOOKIDArr[i]= rs.getInt(1);
//				BOOKNAMEArr[i]= rs.getString(2);
//				PUBLISHERArr[i]= rs.getString(3);
//				PRICEArr[i]= rs.getInt(4);
//				i++;
				
				// 3.객체
//				Book bookObj = new Book(rs.getInt(1),
//								  rs.getString(2),
//								  rs.getString(3),
//								  rs.getInt(4));
//				
//				printObj(bookObj);
				
				// 4.객체 배열
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
	// 1.변수용
//	void printBook(int BOOKID, String BOOKNAME, String PUBLISHER, int PRICE) {
//		System.out.println("\t"+  BOOKID
//							+ "\t"+ BOOKNAME
//							+ "\t"+ PUBLISHER
//							+ "\t"+ PRICE
//							+ "\n");
//	}
	
	// 2.배열 출력용
//	void printBookArr( ) {
//		for(int i=0; i< BOOKIDArr.length; ++i) 
//			System.out.println("\t"+  BOOKIDArr[i]
//					+ "\t"+ BOOKNAMEArr[i]
//					+ "\t"+ PUBLISHERArr[i]
//					+ "\t"+ PRICEArr[i]);
//	}
	
	// 3.객체 출력용
//	void printObj(Book, book ) {
//		System.out.println("\t"+ book.BOOKID
//						+ "\t"+ book.BOOKNAME
//						+ "\t"+ book.PUBLISHER
//						+ "\t"+ book.PRICE
//						+"\n");
//		}
//	}
	
	// 4.객체 배열 출력용 => Book 클래스 독립시켜줌
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
//	public static void main(String args[]) { // 메서드이면서 프로그램실행에 관여함
//		BookList so= new BookList();
//		so.sqlRun();
//	}
}

