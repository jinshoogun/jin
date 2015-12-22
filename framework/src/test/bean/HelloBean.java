package test.bean;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloBean {
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	@Autowired
	private DTO dto;
	@Autowired
	private Date date;
	
	@RequestMapping(value ="/test.do", method=RequestMethod.POST)//업로드시에는 포스트방식만 쓰니 반드시 사용
	public String test() throws Exception {
		System.out.println(dto.getId());
		System.out.println(date);
		return "/12_22/test.jsp";
	}

	@RequestMapping("/hello.do")
	public ModelAndView hello(String id) throws Exception {
		List list = sqlMapClientTemplate.queryForList("selectAll", null);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("/12_21/hello.jsp");
		return mv;
	}
}
