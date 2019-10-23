package cn.iselab.webide.langclient.model;

import lombok.Data;

/**
 * @program: langclient
 * @mail: menduo96@gmail.com
 * @author: menduo
 * @create: 2019-10-22 13:07
 **/
@Data
public class Position {
    private int line;
    private int character;
}
