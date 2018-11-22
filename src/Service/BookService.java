package Service;

import java.util.List;

import domain.Book;

public interface BookService {

		public List<Book> findBookList() throws Exception;

	    public Book  findBookById(int bid) throws Exception;
}
