package cn.iselab.webide.langclient.controller;

import cn.iselab.webide.langclient.model.RequestMessage;
import cn.iselab.webide.langclient.service.MessageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @program: langclient
 * @mail: menduo96@gmail.com
 * @author: menduo
 * @create: 2019-10-14 15:02
 **/
@RestController
public class ClientController {

    @Autowired
    private Socket menduoSocket;
    @Autowired
    private MessageFactory messageFactory;

    @PostMapping("sendMsg")
    private String sendMsg(@RequestBody RequestMessage message) throws IOException {
        System.out.println(message.toString());
        String requestString = messageFactory.toJsonRpcString(message);
        OutputStream os=menduoSocket.getOutputStream();
        os.write(requestString.getBytes(StandardCharsets.UTF_8));
        os.flush();

        return "OK";
    }

}
