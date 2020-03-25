package cn.wmxf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wmxf.pojo.Store;
import cn.wmxf.service.StoreService;
import cn.wmxf.vo.JsonResult;
import cn.wmxf.vo.PageObject;

@RestController
@RequestMapping("/store/")
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@RequestMapping("doFindPageObjects")
	//@ResponseBody
	public JsonResult doFindPageObjects(String shopname,
			Integer pageCurrent) {
		//JsonResult r=new JsonResult();
		//r.setData(sysLogService.findPageObjects(username, pageCurrent));
		PageObject<Store> pageObject=
		storeService.findPageObjects(shopname, pageCurrent);
		
		return JsonResult.success(pageObject);//result.data.records
	}
}
