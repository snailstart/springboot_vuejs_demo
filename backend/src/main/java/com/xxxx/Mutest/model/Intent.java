package com.netease.Mutest.model;

import java.util.Date;

public class Intent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intent.id
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intent.create_time
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intent.modify_time
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intent.name
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intent.domain
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private String domain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intent.description
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intent.id
     *
     * @return the value of intent.id
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intent.id
     *
     * @param id the value for intent.id
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intent.create_time
     *
     * @return the value of intent.create_time
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intent.create_time
     *
     * @param createTime the value for intent.create_time
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intent.modify_time
     *
     * @return the value of intent.modify_time
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intent.modify_time
     *
     * @param modifyTime the value for intent.modify_time
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intent.name
     *
     * @return the value of intent.name
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intent.name
     *
     * @param name the value for intent.name
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intent.domain
     *
     * @return the value of intent.domain
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public String getDomain() {
        return domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intent.domain
     *
     * @param domain the value for intent.domain
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intent.description
     *
     * @return the value of intent.description
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intent.description
     *
     * @param description the value for intent.description
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}