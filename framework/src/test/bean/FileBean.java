package test.bean;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileBean {
	@RequestMapping(value = "/upload.do", method = RequestMethod.POST)
	public String upload(MultipartHttpServletRequest request) throws Exception {
		MultipartFile file = request.getFile("save");
		String fileName = file.getOriginalFilename();
		File copyFile = new File("c://test//"+fileName);
		file.transferTo(copyFile);
		return "/12_22/result.jsp";
	}
	
	 @RequestMapping("/download.do")
	 public ModelAndView down(String name)throws Exception{
		 File down = new File("c://test//"+name);
		 ModelAndView mv = new ModelAndView("download", "downloadFile", down);
		 return mv;
	 }
}
