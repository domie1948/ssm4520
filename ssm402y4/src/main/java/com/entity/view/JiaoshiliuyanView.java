package com.entity.view;

import com.entity.JiaoshiliuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师留言
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
@TableName("jiaoshiliuyan")
public class JiaoshiliuyanView  extends JiaoshiliuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshiliuyanView(){
	}
 
 	public JiaoshiliuyanView(JiaoshiliuyanEntity jiaoshiliuyanEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshiliuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
