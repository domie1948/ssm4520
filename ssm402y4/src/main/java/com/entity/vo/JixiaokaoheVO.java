package com.entity.vo;

import com.entity.JixiaokaoheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 绩效考核
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
public class JixiaokaoheVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 职称
	 */
	
	private String zhicheng;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 考核内容
	 */
	
	private String kaoheneirong;
		
	/**
	 * 考核评分
	 */
	
	private String kaohepingfen;
		
	/**
	 * 考核情况
	 */
	
	private String kaoheqingkuang;
		
	/**
	 * 奖惩情况
	 */
	
	private String jiangchengqingkuang;
		
	/**
	 * 奖惩内容
	 */
	
	private String jiangchengneirong;
		
	/**
	 * 考核日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoheriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：考核内容
	 */
	 
	public void setKaoheneirong(String kaoheneirong) {
		this.kaoheneirong = kaoheneirong;
	}
	
	/**
	 * 获取：考核内容
	 */
	public String getKaoheneirong() {
		return kaoheneirong;
	}
				
	
	/**
	 * 设置：考核评分
	 */
	 
	public void setKaohepingfen(String kaohepingfen) {
		this.kaohepingfen = kaohepingfen;
	}
	
	/**
	 * 获取：考核评分
	 */
	public String getKaohepingfen() {
		return kaohepingfen;
	}
				
	
	/**
	 * 设置：考核情况
	 */
	 
	public void setKaoheqingkuang(String kaoheqingkuang) {
		this.kaoheqingkuang = kaoheqingkuang;
	}
	
	/**
	 * 获取：考核情况
	 */
	public String getKaoheqingkuang() {
		return kaoheqingkuang;
	}
				
	
	/**
	 * 设置：奖惩情况
	 */
	 
	public void setJiangchengqingkuang(String jiangchengqingkuang) {
		this.jiangchengqingkuang = jiangchengqingkuang;
	}
	
	/**
	 * 获取：奖惩情况
	 */
	public String getJiangchengqingkuang() {
		return jiangchengqingkuang;
	}
				
	
	/**
	 * 设置：奖惩内容
	 */
	 
	public void setJiangchengneirong(String jiangchengneirong) {
		this.jiangchengneirong = jiangchengneirong;
	}
	
	/**
	 * 获取：奖惩内容
	 */
	public String getJiangchengneirong() {
		return jiangchengneirong;
	}
				
	
	/**
	 * 设置：考核日期
	 */
	 
	public void setKaoheriqi(Date kaoheriqi) {
		this.kaoheriqi = kaoheriqi;
	}
	
	/**
	 * 获取：考核日期
	 */
	public Date getKaoheriqi() {
		return kaoheriqi;
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
			
}
