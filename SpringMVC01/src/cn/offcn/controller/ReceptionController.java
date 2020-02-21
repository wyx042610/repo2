package cn.offcn.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.offcn.entity.Person;

@Controller//告诉mvc这是控制层
public class ReceptionController {

	@RequestMapping("/tologin.do")
	public String Login() {
		return "login";
	}
	@RequestMapping("/tologin1.do")
	public String Login1(@RequestParam(value = "name",required = true)String names,Integer age) {
		System.out.println(names+"---"+age);
		return "login";
	}
	//前台传对象到后台
	@RequestMapping("/tologin2.do")
	public String Login2(Person p) {
		System.out.println(p);
		return "login";
	}
	//前台传数组到后台
	@RequestMapping("/tologin3.do")
	public String Login3(Person p) {
		System.out.println(p);
		return "login";
	}
	//前台传对象属性到后台
	@RequestMapping("/tologin4.do")
	public String Login4(Person p) {
		System.out.println(p);
		return "login";
	}
	//前台传list对象属性到后台
	@RequestMapping("/tologin5.do")
	public String Login5(Person p) {
		System.out.println(p);
		return "login";
	}
	//前台传list对象属性到后台
	@RequestMapping("/tologin6.do")
	public String Login6(Person p) {
		System.out.println(p);
		return "login";
	}
	//前台传自定义类型属性到后台
	@RequestMapping("/tologin7.do")
	public String Login7(String name,Date birthday) {
		System.out.println(name);
		System.out.println(birthday.toLocaleString());
		return "login";
	}
}
