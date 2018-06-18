package com.pinyougou.sellergoods.service;

import com.pinyougou.entity.PageResult;
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

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageResult findPage(int pageNum,int pageSize);

    /**
     * 新增
     * @param tbBrand
     */
    public void add(TbBrand tbBrand);

    /**
     * 修改保存
     * @param tbBrand
     */
    public void update(TbBrand tbBrand);

    /**
     * 修改请求id
     * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    /**
     * 批量删除
     * @param ids
     */
    public void findatect(Long[] ids);

    /**
     * 根据名称查询
     * @param brand
     * @param page
     * @param size
     * @return
     */
    public PageResult findPage(TbBrand brand,int page,int size);

}
