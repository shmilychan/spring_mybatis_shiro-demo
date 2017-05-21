package cn.mldn.shiro.action;

import org.springframework.web.servlet.ModelAndView;

//@Controller
public class PageAction {
	//@RequestMapping("/loginPage")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("/login.jsp");
		return mav;
	}
}
