package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *领养记录：(AdoptionRecord)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AdoptionRecord")
public class AdoptionRecord implements Serializable {

    //AdoptionRecord编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adoption_record_id")
    private Integer adoption_record_id;
   // 宠物名称
   @Basic
    private String pet_name;
   // 宠物性别
   @Basic
    private String pet_sex;
   // 宠物年龄
   @Basic
    private String pet_age;
   // 领养人
   @Basic
    private Integer adopter;
   // 联系电话
   @Basic
    private String contact_number;
   // 领养状态
   @Basic
    private String adoption_status;
   // 回访状态
   @Basic
    private String return_visit_status;
   // 领养原由
   @Basic
    private String reasons_for_adoption;
   // 回复信息
   @Basic
    private String reply_message;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
