package com.dao;

import com.entity.JiaoshiliuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshiliuyanVO;
import com.entity.view.JiaoshiliuyanView;


/**
 * 教师留言
 * 
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
public interface JiaoshiliuyanDao extends BaseMapper<JiaoshiliuyanEntity> {
	
	List<JiaoshiliuyanVO> selectListVO(@Param("ew") Wrapper<JiaoshiliuyanEntity> wrapper);
	
	JiaoshiliuyanVO selectVO(@Param("ew") Wrapper<JiaoshiliuyanEntity> wrapper);
	
	List<JiaoshiliuyanView> selectListView(@Param("ew") Wrapper<JiaoshiliuyanEntity> wrapper);

	List<JiaoshiliuyanView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshiliuyanEntity> wrapper);
	
	JiaoshiliuyanView selectView(@Param("ew") Wrapper<JiaoshiliuyanEntity> wrapper);
	
}
