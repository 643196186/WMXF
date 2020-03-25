package cn.wmxf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wmxf.service.StoreService;

@RestController
@RequestMapping("/store/")
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
}
