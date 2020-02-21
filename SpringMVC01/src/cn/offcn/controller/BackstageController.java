package cn.offcn.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.offcn.entity.Dog;
import cn.offcn.entity.Person;
@Controller
public class BackstageController {

	//用web  API获取后台数据
	@RequestMapping("/BackstageData1.do")
	public String BackstageData1(HttpServletRequest request) {
		request.setAttribute("name", "陈二狗");
		return "login";
	}
	//用map获取后台数据
	@RequestMapping("/BackstageData2.do")
	public String BackstageData2(Map<String, Object> map) {
		Person p = new Person();
		p.setName("陈三狗");
		p.setAge(12);
		Dog d = new Dog();
		d.setColor("黑色");
		d.setName("狐狸");
		map.put("person", p);
		map.put("dog", d);
		return "login";
	}
	//用model获取后台数据
	@RequestMapping("/BackstageData3.do")
	public String BackstageData3(Model model) {
		model.addAttribute("name","陈三狗");
		return "login";
	}
	//用modelmap获取后台数据
	@RequestMapping("/BackstageData4.do")
	public String BackstageData3(ModelMap modelMap) {
		modelMap.addAttribute("name","陈四狗");
		return "login";
	}
	//用modelmap获取后台数据
	@RequestMapping("/BackstageData5.do")
	public ModelAndView BackstageData3() {
		ModelAndView view = new ModelAndView();
		//放数据
		view.addObject("name", "五狗");
		//设置视图
		view.setViewName("login");
		return view;
	}
}
