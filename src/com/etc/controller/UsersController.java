/** 

 * @author LI 
 * @version 创建时间：2021年7月14日 下午7:00:00 
 * package:com.etc.controller
 * 类说明 处理器 注解实现控制业务

 */ 
package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.pojo.User;

@Controller
@RequestMapping("/usersController")
public class UsersController {

	//静态List<User>集合，此处代替数据库用来保存注册的用户信息
	private static List<User> list;
	//UserController类的构造器，初始化List<User>集合
	public UsersController(){
		super();
		list = new ArrayList<User>();
	}
	
	/**
	 * @return 跳转到注册界面
	 * @throws Exception
	 */
	@RequestMapping(value="/toregister")
	public String toRegister() throws Exception{
		return "register";
	}

	/**
	 * @return 跳转到登录界面
	 * @throws Exception
	 */
	@RequestMapping(value="/tologin")
	public String toLogin() throws Exception{
		return "login";
	}

	/**
	 * controller实现方法获取user的值
	 * @param user
	 * @return 返回操作之后的界面
	 * @throws Exception
	 */
	@RequestMapping(value="/login")
	public String login(User user,Model model) throws Exception{
		String username = user.getUsername();
		String password = user.getPassword();
		//登录判断
		if(username != "" && password != ""){//当输入值全不为空时继续
			if(list.size()>0){
				//判断用户名是否存在，且用户和密码是否一致
				for(User u : list){
					if(u.getUsername().equals(username) && u.getPassword().equals(password)){
						//传递值到视图
						model.addAttribute("usersList",list);
						return "welcome";
					}else if(u.getUsername().equals(username)){
						System.out.println("密码不正确！");
					}else{
						System.out.println("用户不存在，请先注册！");
					}
				}
			}else{
				System.out.println("用户不存在，请先注册！");
			}
		}else{
			System.out.println("用户名或密码不能为空！");
		}
		return "login";
	}

	/**
	 * controller实现方法获取user的值
	 * @param user
	 * @return 返回操作之后的界面
	 * @throws Exception
	 */
	@RequestMapping(value="/register")
	public String register(User user) throws Exception{
		String username = user.getUsername();
		String password = user.getPassword();
		if((username != "") && (password != "")){
			System.out.println("从页面得到的值：" + user.getUsername() + ":" + user.getPassword());
			list.add(user);
			return "login";
		}else{
			System.out.println("用户名或密码不能为空！");
		}
		return "register";
	}
}
