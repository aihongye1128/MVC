package Controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.BookServiceImpl;
import domain.Book;


@Controller
@RequestMapping(value = "/book")
public class BookController
{
	
	@Autowired
	private BookServiceImpl bookService;

	
	
	@ModelAttribute
	public void getBb(Map<String, Object> map) throws Exception{
		Book book=bookService.findBookById(10);
		System.out.println(book);
		map.put("book", book);
		
	}
	
	
	
	
	@RequestMapping(value = "/book")
	public String book(Model model, HttpServletRequest request,HttpServletResponse reponse,Book book,Integer category) throws Exception
	{	
		
		
		if(category==0){
			request.setAttribute("bookList", bookService.findBookList());
		}else{
			request.setAttribute("bookList", bookService.findBookById(category));
		}
		request.getRequestDispatcher("/show.jsp").forward(request, reponse);
		System.out.println("ccccccccccccc");
		System.out.println(book);
	
		return "redirect:/book/book1/1/1";
	}

	
	@RequestMapping(value = "/book1/{name}/{aa}")
	public String book1(Model model, HttpServletRequest request,HttpServletResponse reponse,@PathVariable("name")String name,@PathVariable("aa")String aa ) throws Exception
	{	
		
		System.out.println("book1");
		System.out.println(name);
		System.out.println(aa);
		return null;
	}

}
