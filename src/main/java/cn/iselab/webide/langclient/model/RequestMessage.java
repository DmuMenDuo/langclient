package cn.iselab.webide.langclient.model;

import lombok.Data;
import lombok.ToString;

/**
 * @program: langclient
 * @mail: menduo96@gmail.com
 * @author: menduo
 * @create: 2019-10-14 15:51
 **/
@Data
@ToString(callSuper = true)
public class RequestMessage extends Message {
    private Params params;
}
