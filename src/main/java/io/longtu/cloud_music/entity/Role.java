package io.longtu.cloud_music.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Role extends AbstractEntity{

    private String name;

    private String identifyCode;
}