package pattern.behavioral.iterator.aggregate;

import pattern.behavioral.iterator.Book;
import pattern.behavioral.iterator.iterator.BookShelfIterator;
import pattern.behavioral.iterator.iterator.Iterator;

/* ConcreteAggregate
 * 해당하는 ConcreteIterator의 인스턴스를 반환하는 Iterator 생성 인터페이스 구현
 */
public class BookShelf implements Aggregate {

	private Book[] books;
	
	private int last=0;
	
	public BookShelf(int maxsize) {
		this.books=new Book[maxsize];
	}
	
	public Book getBookAt(int index){
		return books[index];
	}
	
	public void appendBook(Book book){
		this.books[last]=book;
		last++;
	}
	
	public int getLength(){
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
