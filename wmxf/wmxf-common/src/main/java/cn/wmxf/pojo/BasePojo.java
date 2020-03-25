package cn.wmxf.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

//pojo基类，完成2个任务，2个日期，实现序列化
@Data	//set/get方法
@Accessors(chain=true)
public class BasePojo implements Serializable{
	private Date created;	
	private Date updated;

}
package cn.wmxf.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

//pojo基类，完成2个任务，2个日期，实现序列化
@Data
@Accessors(chain=true)
public class BasePojo implements Serializable{
	private static final long serialVersionUID = 7985108593250070077L;
	private Date created;
	private Date updated;

}
package cn.wmxf.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

//pojo基类，完成2个任务，2个日期，实现序列化
@Data
@Accessors(chain=true)
public class BasePojo implements Serializable{
	private static final long serialVersionUID = 7985108593250070077L;
	private Date created;
	private Date updated;

}
