package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoshiliuyanDao;
import com.entity.JiaoshiliuyanEntity;
import com.service.JiaoshiliuyanService;
import com.entity.vo.JiaoshiliuyanVO;
import com.entity.view.JiaoshiliuyanView;

@Service("jiaoshiliuyanService")
public class JiaoshiliuyanServiceImpl extends ServiceImpl<JiaoshiliuyanDao, JiaoshiliuyanEntity> implements JiaoshiliuyanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshiliuyanEntity> page = this.selectPage(
                new Query<JiaoshiliuyanEntity>(params).getPage(),
                new EntityWrapper<JiaoshiliuyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshiliuyanEntity> wrapper) {
		  Page<JiaoshiliuyanView> page =new Query<JiaoshiliuyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshiliuyanVO> selectListVO(Wrapper<JiaoshiliuyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshiliuyanVO selectVO(Wrapper<JiaoshiliuyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshiliuyanView> selectListView(Wrapper<JiaoshiliuyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshiliuyanView selectView(Wrapper<JiaoshiliuyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
