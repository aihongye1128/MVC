package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;





@Controller
public class UpLoadController
{
	


	
//	@RequestMapping(value = "/UpLoad")
//	public String UpLoad(Model model, HttpServletRequest request,HttpServletResponse response,@RequestParam MultipartFile[] multipartFile) throws Exception
//	{	
//		
//		for (MultipartFile files : multipartFile)
//		{
//			if(!files.isEmpty()){
//				String realpath = request.getServletContext().getRealPath("/upload");
//				String uuid = UUID.randomUUID().toString().replace("-", "")
//						.toUpperCase();
//				String filename = files.getOriginalFilename();
//				String savename = uuid + "_" + filename;
//				Date date = new Date();
//				String filePath = new SimpleDateFormat("yyyy/MM/dd")
//						.format(date);
//				File dirFile = new File(realpath, filePath);		
//				// 3.创建目录链
//				if (!dirFile.exists()) dirFile.mkdirs();
//				// 4.创建目录文件
//				File destFile = new File(dirFile, savename);
//				System.out.println(destFile.getAbsolutePath());
//				// 5.保存
//				files.transferTo(destFile);
//				//FileUtils.copyInputStreamToFile(files.getInputStream(), destFile);
//				// 把图片地址存入数据库，保存多个上传图片的路径
//				model.addAttribute("msg","/upload" + "/" + filePath + "/" + savename);
//				model.addAttribute("message", "文件上传成功");
//				System.out.println("上传成功");
//			}
//			
//		}
//		return null;
//	}
//
//	@RequestMapping(value = "/DownLoad")
//	public void DownLoad(Model model, HttpServletRequest request,HttpServletResponse response,String filename) throws Exception
//	{	
//	
//			    String name=new String(filename.getBytes("iso-8859-1"),"utf-8");
//			    response.setContentType(request.getServletContext().getMimeType(name));
//			    response.setHeader("Content-Disposition", "attachment;filename="+filenameEncoding(name, request));
//			    String realpath="D:\\"+name;
//			    FileInputStream fileInputStream=new FileInputStream(realpath);
//			    IOUtils.copy(fileInputStream, response.getOutputStream());
//			    fileInputStream.close();
//
//	}

	
//	public static String filenameEncoding(String filename, HttpServletRequest request) throws IOException {
//		String agent = request.getHeader("User-Agent"); //获取浏览器
//		if (agent.contains("Firefox")) {
//			BASE64Encoder base64Encoder = new BASE64Encoder();
//			filename = "=?utf-8?B?"
//					+ base64Encoder.encode(filename.getBytes("utf-8"))
//					+ "?=";
//		} else if(agent.contains("MSIE")) {
//			filename = URLEncoder.encode(filename, "utf-8");
//		} else {
//			filename = URLEncoder.encode(filename, "utf-8");
//		}
//		return filename;
//	}
	
	
	@RequestMapping(value = "/aa")
	public void aa(MultipartFile attach) throws Exception{
		
		System.out.println(attach.getOriginalFilename());
		
	}
	
	
	
	
	
	
	
}

