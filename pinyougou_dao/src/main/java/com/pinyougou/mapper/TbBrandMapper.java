package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TbBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    int countByExample(TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    int deleteByExample(TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    int insert(TbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    int insertSelective(TbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    List<TbBrand> selectByExample(TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    TbBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbBrand record);

    /**
     *
     * @return
     */
    List<Map> selectOptionList();
}