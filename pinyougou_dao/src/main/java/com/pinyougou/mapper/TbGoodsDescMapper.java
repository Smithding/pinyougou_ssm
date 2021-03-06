package com.pinyougou.mapper;

import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbGoodsDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsDescMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int countByExample(TbGoodsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int deleteByExample(TbGoodsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int insert(TbGoodsDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int insertSelective(TbGoodsDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    List<TbGoodsDesc> selectByExample(TbGoodsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    TbGoodsDesc selectByPrimaryKey(Long goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbGoodsDesc record, @Param("example") TbGoodsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbGoodsDesc record, @Param("example") TbGoodsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbGoodsDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbGoodsDesc record);
}