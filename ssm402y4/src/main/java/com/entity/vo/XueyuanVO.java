package com.entity.vo;

import com.entity.XueyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学院
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
public class XueyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 绩效考核
	 */
	
	private String jixiaokaohe;
		
	/**
	 * 学院评分
	 */
	
	private String xueyuanpingfen;
		
	/**
	 * 年度
	 */
	
	private String niandu;
		
	/**
	 * 学期
	 */
	
	private String xueqi;
				
	
	/**
	 * 设置：绩效考核
	 */
	 
	public void setJixiaokaohe(String jixiaokaohe) {
		this.jixiaokaohe = jixiaokaohe;
	}
	
	/**
	 * 获取：绩效考核
	 */
	public String getJixiaokaohe() {
		return jixiaokaohe;
	}
				
	
	/**
	 * 设置：学院评分
	 */
	 
	public void setXueyuanpingfen(String xueyuanpingfen) {
		this.xueyuanpingfen = xueyuanpingfen;
	}
	
	/**
	 * 获取：学院评分
	 */
	public String getXueyuanpingfen() {
		return xueyuanpingfen;
	}
				
	
	/**
	 * 设置：年度
	 */
	 
	public void setNiandu(String niandu) {
		this.niandu = niandu;
	}
	
	/**
	 * 获取：年度
	 */
	public String getNiandu() {
		return niandu;
	}
				
	
	/**
	 * 设置：学期
	 */
	 
	public void setXueqi(String xueqi) {
		this.xueqi = xueqi;
	}
	
	/**
	 * 获取：学期
	 */
	public String getXueqi() {
		return xueqi;
	}
			
}
