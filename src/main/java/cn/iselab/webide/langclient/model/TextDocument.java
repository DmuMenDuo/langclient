package cn.iselab.webide.langclient.model;

import lombok.Data;

/**
 * @program: langclient
 * @mail: menduo96@gmail.com
 * @author: menduo
 * @create: 2019-10-22 13:06
 **/
@Data
public class TextDocument {
    private String uri;
    private int version;
}
