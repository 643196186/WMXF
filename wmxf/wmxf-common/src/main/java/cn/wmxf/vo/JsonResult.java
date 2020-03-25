package cn.wmxf.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class JsonResult implements Serializable{
	
	private static final long serialVersionUID = 6839198920517572921L;
	private Integer status;		//200表示成功  201表示失败
	private String msg;			//服务器回传的提示信息
	private Object data;		//服务器返回页面数据
	
	//1.重载方法,实现数据简化   只返回正确的状态码信息200.
		public static JsonResult success() {
			
			return new JsonResult(200,"调用成功!", null);
		}
		
		//2.返回服务器数据 
		public static JsonResult success(Object data) {
			
			return new JsonResult(200,"调用成功!", data);
		}
		
		//3.只返回服务器提示信息.
		public static JsonResult success(String msg,Object data) {
			
			return new JsonResult(200,msg, data);
		}
		
		//4.定义失败的方法
		public static JsonResult fail() {
			
			return new JsonResult(201,"业务调用失败",null);
		}
	
}
