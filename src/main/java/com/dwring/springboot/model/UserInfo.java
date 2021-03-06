package com.dwring.springboot.model;

import java.io.Serializable;

/**  
* @ClassName: UserInfo  
* @Description:  
* @author haichangzhang  
* @date 2017年7月26日 下午6:07:08  
*    
*/
public class UserInfo  implements Serializable{
    /**  
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.Id
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.username
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.password
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.usertype
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    private String usertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.enabled
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    private Integer enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.realname
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    private String realname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.qq
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.email
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.tel
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    private String tel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.Id
     *
     * @return the value of user_info.Id
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.Id
     *
     * @param id the value for user_info.Id
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.username
     *
     * @return the value of user_info.username
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.username
     *
     * @param username the value for user_info.username
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.password
     *
     * @return the value of user_info.password
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.password
     *
     * @param password the value for user_info.password
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.usertype
     *
     * @return the value of user_info.usertype
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.usertype
     *
     * @param usertype the value for user_info.usertype
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.enabled
     *
     * @return the value of user_info.enabled
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.enabled
     *
     * @param enabled the value for user_info.enabled
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.realname
     *
     * @return the value of user_info.realname
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.realname
     *
     * @param realname the value for user_info.realname
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.qq
     *
     * @return the value of user_info.qq
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.qq
     *
     * @param qq the value for user_info.qq
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.email
     *
     * @return the value of user_info.email
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.email
     *
     * @param email the value for user_info.email
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.tel
     *
     * @return the value of user_info.tel
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.tel
     *
     * @param tel the value for user_info.tel
     *
     * @mbggenerated Thu May 25 16:18:06 CST 2017
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
}