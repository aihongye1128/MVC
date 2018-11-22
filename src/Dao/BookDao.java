package Dao;

import java.util.List;

import domain.Book;





public interface BookDao {
    
    public List<Book> findBookList() throws Exception;

    public Book  findBookById(int bid) throws Exception;
    
    
    
    
    
    
    
    
    
    
}