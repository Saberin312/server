package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 19:41 2019/9/4
 *@Modified By:
 */
@org.hibernate.annotations.Entity
@Getter
@Setter
@ToString
//@Entity
@Table(name = "node")
public class Node {
    private Integer id;
    private Timestamp timestamp;
    private Long value;
}
