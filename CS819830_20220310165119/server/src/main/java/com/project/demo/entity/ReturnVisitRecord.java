package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *回访记录：(ReturnVisitRecord)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ReturnVisitRecord")
public class ReturnVisitRecord implements Serializable {

    //ReturnVisitRecord编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "return_visit_record_id")
    private Integer return_visit_record_id;
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
   // 回访照片
   @Basic
    private String return_visit_photos;
   // 回访描述
   @Basic
    private String return_visit_description;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
