package com.myself.everything.core.model;

import lombok.Data;

//文件属性信息索引之后的记录 Thing表示
@Data  //getter setter toString 生成完成
public class Thing {
    //文件名称（保留名称）
    //File D:/a/b/hello.txt -> hello.txt
    private String name;

    //文件路径
    private String path;

    //文件路径深度
    private int depth;

    //文件类型
    private FileType fileType;//存的是枚举类型的变量
}
