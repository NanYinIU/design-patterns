package com.nanyin.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author gaoguoxing
 * @version 1.0
 * @date 2020-10-05
 */
public class NioSocketServer {
    public static void main(String[] args) {
        ServerSocketChannel serverSocketChannel = null;
        try {
            // 对应内核中的 socket
            serverSocketChannel = ServerSocketChannel.open();
            // 对应内核中的 bind
            serverSocketChannel.bind(new InetSocketAddress(8090));
            // 服务端设置为非阻塞
            serverSocketChannel.configureBlocking(false);

            List<SocketChannel> clients = new ArrayList<>();

            while(true){
                Thread.sleep(1000);
                // 对应内核中的select或poll
                SocketChannel accept = serverSocketChannel.accept();
                if(accept == null){
                    System.out.println("未有客户端连接！！！");
                }else{
                    // 客户端设置为非阻塞
                    accept.configureBlocking(false);
                    System.out.println("收到客户端连接，客户端端口号为:"+accept.socket().getPort());
                    clients.add(accept);
                }

                // 循环buffer中的内容，进行输出
                for (SocketChannel client : clients) {
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    int read = client.read(byteBuffer);
                    if(read > 0){
                        // >0 有数据 =0 没有数据， <0 断开连接
                        byteBuffer.flip(); //翻转切换为读模式
                        byte[] bytes = new byte[byteBuffer.limit()];
                        byteBuffer.get(bytes);
                        System.out.println("客户端："+client.socket().getPort()+",读取到信息："+ new String(bytes));
                        byteBuffer.clear(); //清空bytebuffer内容，以准备重新读写
                    }
                }
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
