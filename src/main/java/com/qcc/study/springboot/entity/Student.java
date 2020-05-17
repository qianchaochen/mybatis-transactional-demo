package com.qcc.study.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO
 *
 * @author qianchaochen
 * @date 2020/5/16 17:06
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private String sex;
}
