package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.BookDao;
import domain.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> findBookList() throws Exception {
		
		return bookDao.findBookList();
	}

	
	@Override
	public Book findBookById(int bid) throws Exception {
		
		return bookDao.findBookById(bid);
	}

}
