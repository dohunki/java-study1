
public class Basic {

	public static void main(String[] args) {
			BookList bookList= new BookList();
			bookList.getConnection();
			bookList.getBook();
//			b.printBookArr(); //2.�迭 ���
//			b.printObjArr(); // 4.��ü�迭 ���- �� �޼��尡 BookList�ȿ� ���� ���!
			
//			for(int i= 0; i< b.bookArr.length; ++i) { // private�� �ϸ� �۵� ����!
//				b.bookArr[i].printBook();
//			}
			
			for(int i= 0; i< bookList.getBookArr().length; ++i) { 
				bookList.getBookArr()[i].printBook();
			}
	}

}
