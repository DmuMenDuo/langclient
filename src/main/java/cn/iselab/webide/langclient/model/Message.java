package cn.iselab.webide.langclient.model;

import lombok.Data;

/**
 * @program: langclient
 * @mail: menduo96@gmail.com
 * @author: menduo
 * @create: 2019-10-14 15:02
 **/
@Data
public class Message {
    private String jsonrpc;
    private String method;
    private String id;
}
