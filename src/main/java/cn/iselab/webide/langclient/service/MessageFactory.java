package cn.iselab.webide.langclient.service;

import cn.iselab.webide.langclient.model.RequestMessage;
import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @program: langclient
 * @mail: menduo96@gmail.com
 * @author: menduo
 * @create: 2019-10-14 16:09
 **/
@Service
public class MessageFactory {

    public String toJsonRpcString(RequestMessage requestMessage) {
        String content = JSONObject.toJSONString(requestMessage);
        System.out.println(content);
        //2、传输内容
        String header = "Content-Length: "+content.getBytes().length+"\r\n";
        String split =  "\r\n";

        return header + split + content;
    }

}
