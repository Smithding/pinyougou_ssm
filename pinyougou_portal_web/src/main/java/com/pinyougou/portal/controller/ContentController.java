package com.pinyougou.portal.controller;



import jdk.nashorn.internal.ir.annotations.Reference;

import java.util.List;

/**
 * @author 三国的包子
 * @version 1.0
 * @description 描述
 * @title 标题
 * @date 2018/6/26
 * @package com.pinyougou.portal.controller
 * @company www.itheima.com
 */
@RestController
@RequestMapping("/content")
public class ContentController {
    @Reference
    private ContentService contentService;

    @RequestMapping("/findContentListByCatId")
    public List<TbContent> findContentListByCatId(Long categoryId){
       return  contentService.findContentListByCatId(categoryId);
    }
}
