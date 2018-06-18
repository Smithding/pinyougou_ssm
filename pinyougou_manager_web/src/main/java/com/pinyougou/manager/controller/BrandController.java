package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.entity.PageResult;
import com.pinyougou.entity.Result;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 三国的包子
 * @version 1.0
 * @description 描述
 * @title 标题
 * @date 2018/6/14
 * @package com.pinyougou.manager.controller
 * @company www.itheima.com
 */
@Controller
@RequestMapping("/brand")
public class BrandController {
    @Reference//引入服务《dubbo:refrenece》
    private BrandService brandService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<TbBrand> findAll(){

        return brandService.getBranList();
    }

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findPage")
    @ResponseBody
    public PageResult findPage(String pageNum,String pageSize){
        PageResult page = brandService.findPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
        return page;
    }

    /**
     * 新增
     */
    @RequestMapping("/findAdd")
    @ResponseBody
    public Result findAdd( @RequestBody TbBrand brand){
        try {

            brandService.add(brand);
            return new Result(true,"新建成功");

        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"新建失败");
        }
    }

    /**
     * 修改类保存
     *
     * @param brand
     * @return
     */
    @RequestMapping("/findUpdate")
    @ResponseBody
    public Result findUpdate(@RequestBody TbBrand brand){
        try {
            brandService.update(brand);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    /**
     * 修改请求id
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    @ResponseBody
    public TbBrand findOne(Long id){
        return brandService.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/findatect")
    @ResponseBody
    public Result findatect(Long[] ids){
        try {
            brandService.findatect(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }


    /**
     * 根据名称查询
     * @param brand
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    @ResponseBody
    public PageResult search(@RequestBody TbBrand brand, int page, int rows  ){

        PageResult page1 = brandService.findPage(brand, page, rows);
        return page1;
    }



}
