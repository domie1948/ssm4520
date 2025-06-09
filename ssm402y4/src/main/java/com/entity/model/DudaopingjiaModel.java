package com.entity.model;

import com.entity.DudaopingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 督导评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
public class DudaopingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 职称
	 */
	
	private String zhicheng;
		
	/**
	 * 督导评分
	 */
	
	private String dudaopingfen;
		
	/**
	 * 督导评价
	 */
	
	private String dudaopingjia;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 督导工号
	 */
	
	private String dudaogonghao;
		
	/**
	 * 督导姓名
	 */
	
	private String dudaoxingming;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：职称
	 */
	 
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
				
	
	/**
	 * 设置：督导评分
	 */
	 
	public void setDudaopingfen(String dudaopingfen) {
		this.dudaopingfen = dudaopingfen;
	}
	
	/**
	 * 获取：督导评分
	 */
	public String getDudaopingfen() {
		return dudaopingfen;
	}
				
	
	/**
	 * 设置：督导评价
	 */
	 
	public void setDudaopingjia(String dudaopingjia) {
		this.dudaopingjia = dudaopingjia;
	}
	
	/**
	 * 获取：督导评价
	 */
	public String getDudaopingjia() {
		return dudaopingjia;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：督导工号
	 */
	 
	public void setDudaogonghao(String dudaogonghao) {
		this.dudaogonghao = dudaogonghao;
	}
	
	/**
	 * 获取：督导工号
	 */
	public String getDudaogonghao() {
		return dudaogonghao;
	}
				
	
	/**
	 * 设置：督导姓名
	 */
	 
	public void setDudaoxingming(String dudaoxingming) {
		this.dudaoxingming = dudaoxingming;
	}
	
	/**
	 * 获取：督导姓名
	 */
	public String getDudaoxingming() {
		return dudaoxingming;
	}
			
}
