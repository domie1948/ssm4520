package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshiliuyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshiliuyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshiliuyanView;


/**
 * 教师留言
 *
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
public interface JiaoshiliuyanService extends IService<JiaoshiliuyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshiliuyanVO> selectListVO(Wrapper<JiaoshiliuyanEntity> wrapper);
   	
   	JiaoshiliuyanVO selectVO(@Param("ew") Wrapper<JiaoshiliuyanEntity> wrapper);
   	
   	List<JiaoshiliuyanView> selectListView(Wrapper<JiaoshiliuyanEntity> wrapper);
   	
   	JiaoshiliuyanView selectView(@Param("ew") Wrapper<JiaoshiliuyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshiliuyanEntity> wrapper);
   	
}

