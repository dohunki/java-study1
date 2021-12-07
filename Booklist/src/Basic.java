
public class Basic {

	public static void main(String[] args) {
			BookList bookList= new BookList();
			bookList.getConnection();
			bookList.getBook();
//			b.printBookArr(); //2.배열 출력
//			b.printObjArr(); // 4.객체배열 출력- 이 메서드가 BookList안에 있을 경우!
			
//			for(int i= 0; i< b.bookArr.length; ++i) { // private로 하면 작동 안함!
//				b.bookArr[i].printBook();
//			}
			
			for(int i= 0; i< bookList.getBookArr().length; ++i) { 
				bookList.getBookArr()[i].printBook();
			}
	}

}
