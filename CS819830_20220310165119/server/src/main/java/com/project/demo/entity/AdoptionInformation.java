package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *领养信息：(AdoptionInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AdoptionInformation")
public class AdoptionInformation implements Serializable {

    //AdoptionInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adoption_information_id")
    private Integer adoption_information_id;
   // 标题名称
   @Basic
    private String title_name;
   // 发布时间
   @Basic
    private Timestamp release_time;
   // 宠物状态
   @Basic
    private String pet_status;
   // 宠物名称
   @Basic
    private String pet_name;
   // 宠物种类
   @Basic
    private String pet_species;
   // 宠物性别
   @Basic
    private String pet_sex;
   // 宠物年龄
   @Basic
    private String pet_age;
   // 宠物图片
   @Basic
    private String pet_pictures;
   // 详细信息
   @Basic
    private String detailed_information;
   // 备注信息
   @Basic
    private String remark_information;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
