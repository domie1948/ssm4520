package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengpingjiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengpingjiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengpingjiaoView;


/**
 * 学生评教
 *
 * @author 
 * @email 
 * @date 2020-11-26 20:02:56
 */
public interface XueshengpingjiaoService extends IService<XueshengpingjiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengpingjiaoVO> selectListVO(Wrapper<XueshengpingjiaoEntity> wrapper);
   	
   	XueshengpingjiaoVO selectVO(@Param("ew") Wrapper<XueshengpingjiaoEntity> wrapper);
   	
   	List<XueshengpingjiaoView> selectListView(Wrapper<XueshengpingjiaoEntity> wrapper);
   	
   	XueshengpingjiaoView selectView(@Param("ew") Wrapper<XueshengpingjiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengpingjiaoEntity> wrapper);
   	
}

