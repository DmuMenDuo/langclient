package cn.iselab.webide.langclient.model;

import lombok.Data;

/**
 * @program: langclient
 * @mail: menduo96@gmail.com
 * @author: menduo
 * @create: 2019-10-23 12:15
 **/
@Data
public class Range {
    private Position start;
    private Position end;

}
