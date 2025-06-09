package com.entity.model;

import com.entity.XueshengpingjiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生评教
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
public class XueshengpingjiaoModel  implements Serializable {
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
	 * 科目
	 */
	
	private String kemu;
		
	/**
	 * 学分
	 */
	
	private String xuefen;
		
	/**
	 * 学年
	 */
	
	private String xuenian;
		
	/**
	 * 学期
	 */
	
	private String xueqi;
		
	/**
	 * 教学评分
	 */
	
	private String jiaoxuepingfen;
		
	/**
	 * 教学趣味
	 */
	
	private String jiaoxuequwei;
		
	/**
	 * 沟通表达
	 */
	
	private String goutongbiaoda;
		
	/**
	 * 个人建议
	 */
	
	private String gerenjianyi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：科目
	 */
	 
	public void setKemu(String kemu) {
		this.kemu = kemu;
	}
	
	/**
	 * 获取：科目
	 */
	public String getKemu() {
		return kemu;
	}
				
	
	/**
	 * 设置：学分
	 */
	 
	public void setXuefen(String xuefen) {
		this.xuefen = xuefen;
	}
	
	/**
	 * 获取：学分
	 */
	public String getXuefen() {
		return xuefen;
	}
				
	
	/**
	 * 设置：学年
	 */
	 
	public void setXuenian(String xuenian) {
		this.xuenian = xuenian;
	}
	
	/**
	 * 获取：学年
	 */
	public String getXuenian() {
		return xuenian;
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
				
	
	/**
	 * 设置：教学评分
	 */
	 
	public void setJiaoxuepingfen(String jiaoxuepingfen) {
		this.jiaoxuepingfen = jiaoxuepingfen;
	}
	
	/**
	 * 获取：教学评分
	 */
	public String getJiaoxuepingfen() {
		return jiaoxuepingfen;
	}
				
	
	/**
	 * 设置：教学趣味
	 */
	 
	public void setJiaoxuequwei(String jiaoxuequwei) {
		this.jiaoxuequwei = jiaoxuequwei;
	}
	
	/**
	 * 获取：教学趣味
	 */
	public String getJiaoxuequwei() {
		return jiaoxuequwei;
	}
				
	
	/**
	 * 设置：沟通表达
	 */
	 
	public void setGoutongbiaoda(String goutongbiaoda) {
		this.goutongbiaoda = goutongbiaoda;
	}
	
	/**
	 * 获取：沟通表达
	 */
	public String getGoutongbiaoda() {
		return goutongbiaoda;
	}
				
	
	/**
	 * 设置：个人建议
	 */
	 
	public void setGerenjianyi(String gerenjianyi) {
		this.gerenjianyi = gerenjianyi;
	}
	
	/**
	 * 获取：个人建议
	 */
	public String getGerenjianyi() {
		return gerenjianyi;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
