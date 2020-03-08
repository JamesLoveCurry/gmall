package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lbh
 * @email heihei@163.com
 * @date 2020-03-07 15:19:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
