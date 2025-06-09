package com.dao;

import com.entity.XueshengpingjiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengpingjiaoVO;
import com.entity.view.XueshengpingjiaoView;


/**
 * 学生评教
 * 
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
public interface XueshengpingjiaoDao extends BaseMapper<XueshengpingjiaoEntity> {
	
	List<XueshengpingjiaoVO> selectListVO(@Param("ew") Wrapper<XueshengpingjiaoEntity> wrapper);
	
	XueshengpingjiaoVO selectVO(@Param("ew") Wrapper<XueshengpingjiaoEntity> wrapper);
	
	List<XueshengpingjiaoView> selectListView(@Param("ew") Wrapper<XueshengpingjiaoEntity> wrapper);

	List<XueshengpingjiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengpingjiaoEntity> wrapper);
	
	XueshengpingjiaoView selectView(@Param("ew") Wrapper<XueshengpingjiaoEntity> wrapper);
	
}
