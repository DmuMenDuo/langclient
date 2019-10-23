package cn.iselab.webide.langclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

@SpringBootApplication
public class LangclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LangclientApplication.class, args);
    }



    @Bean
    public Socket menduoSocket() {
        String ip="127.0.0.1";
        int port=2087;
        Socket sck= null;
        try {
            sck = new Socket(ip,port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(new MyThread(sck)).start();
        return sck;
    }

    class MyThread implements Runnable {
        private Socket sck;

        public MyThread(Socket sck) {
            this.sck = sck;
        }

        @Override
        public void run() {
            InputStream inputStream = null;
            try {
                inputStream = sck.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");
                int tem;
                while((tem=inputStream.read())!=-1){
                    System.out.print((char)tem);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
