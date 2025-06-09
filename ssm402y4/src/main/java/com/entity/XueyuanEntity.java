package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学院
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
@TableName("xueyuan")
public class XueyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueyuanEntity() {
		
	}
	
	public XueyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学院
	 */
					
	private String xueyuan;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学院
	 */
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	/**
	 * 获取：学院
	 */
	public String getXueyuan() {
		return xueyuan;
	}
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
