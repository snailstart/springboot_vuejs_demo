package com.netease.Mutest.dao;

import com.netease.Mutest.model.Cases;

public interface CasesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int insert(Cases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int insertSelective(Cases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    Cases selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int updateByPrimaryKeySelective(Cases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int updateByPrimaryKey(Cases record);
}