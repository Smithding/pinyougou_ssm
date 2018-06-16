package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * @author 三国的包子
 * @version 1.0
 * @description 描述
 * @title 标题
 * @date 2018/6/14
 * @package com.pinyougou.sellergoods.service
 * @company www.itheima.com
 */
public interface BrandService {
    /**
     * 返回所有的品牌列表
     * @return
     */
    List<TbBrand> getBranList();
}
