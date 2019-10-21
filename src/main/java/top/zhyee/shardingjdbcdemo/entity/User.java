package top.zhyee.shardingjdbcdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
@ToString
public class User {

    @Id
    private int id;
    private String name;
    private String passwordLogic;
}
