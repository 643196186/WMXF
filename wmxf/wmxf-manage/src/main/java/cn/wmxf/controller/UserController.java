package cn.wmxf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wmxf.pojo.User;
import cn.wmxf.service.UserService;
import cn.wmxf.vo.JsonResult;
import cn.wmxf.vo.PageObject;

@RestController
@RequestMapping("/user")
public class UserController {


	@Autowired
	private UserService userService;
	
	@RequestMapping("/doFindPageObjects")
	//@ResponseBody
	public JsonResult doFindPageObjects(String username,
			Integer pageCurrent) {
		//JsonResult r=new JsonResult();
		//r.setData(sysLogService.findPageObjects(username, pageCurrent));
		PageObject<User> pageObject=
		userService.findPageObjects(username, pageCurrent);
		return JsonResult.success(pageObject);//result.data.records
	}
}
