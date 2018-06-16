package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class BrandController {
    @Reference//引入服务《dubbo:refrenece》
    private BrandService brandService;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<TbBrand> findAll(){
        return brandService.getBranList();
    }
}
