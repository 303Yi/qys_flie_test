package com.fyd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * (TFlie)实体类
 *
 * @author makejava
 * @since 2021-04-07 17:57:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString
public class TFlie implements Serializable {
    private static final long serialVersionUID = -27389222853966663L;
    /**
     * UUID
     */
    private String uuid;
    /**
     * 文件大小
     */
    private Long szie;
    /**
     * 文件类型
     */
    private String type;
    /**
     * 文件名
     */
    private String name;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 保存目录
     */
    private String filePath;

    private String newName;

}
