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


import com.dao.XueshengpingjiaoDao;
import com.entity.XueshengpingjiaoEntity;
import com.service.XueshengpingjiaoService;
import com.entity.vo.XueshengpingjiaoVO;
import com.entity.view.XueshengpingjiaoView;

@Service("xueshengpingjiaoService")
public class XueshengpingjiaoServiceImpl extends ServiceImpl<XueshengpingjiaoDao, XueshengpingjiaoEntity> implements XueshengpingjiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengpingjiaoEntity> page = this.selectPage(
                new Query<XueshengpingjiaoEntity>(params).getPage(),
                new EntityWrapper<XueshengpingjiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengpingjiaoEntity> wrapper) {
		  Page<XueshengpingjiaoView> page =new Query<XueshengpingjiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengpingjiaoVO> selectListVO(Wrapper<XueshengpingjiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengpingjiaoVO selectVO(Wrapper<XueshengpingjiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengpingjiaoView> selectListView(Wrapper<XueshengpingjiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengpingjiaoView selectView(Wrapper<XueshengpingjiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
