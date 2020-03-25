package cn.wmxf.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User extends BasePojo{
	
	
	private Long id;			//用户id
	private String username;	//用户昵称 
	private String mobile; 		//联系电话
	private String password; 	//用户密码 md5加密
	private Integer wallet; 	//氪星币（积分）
	private String gender; 		//性别
	private Integer status; 	//用户状态     1正常 2封禁 0已注销
	private String truename; 	//用户姓名

	 
}
