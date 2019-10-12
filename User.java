package com.diandian.sharingOffice.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2019-07-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user")
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 账号唯一编码
     */
    private String accountId;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号
     */
    private String tel;

    private String password;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 建创时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    private String email;

    /**
     * 企业单位
     */
    private String company;

    public static final String ACCOUNT_ID = "account_id";

    public static final String SEX = "sex";

    public static final String NAME = "name";

    public static final String NICKNAME = "nickname";

    public static final String TEL = "tel";

    public static final String PASSWORD = "password";

    public static final String ID_CARD = "id_card";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String EMAIL = "email";

    public static final String COMPANY = "company";

}
