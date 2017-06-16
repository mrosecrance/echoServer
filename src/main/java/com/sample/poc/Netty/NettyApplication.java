package com.sample.poc.Netty;


//import io.netty.bootstrap.ServerBootstrap;
//import io.netty.channel.ChannelPipeline;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;


public class NettyApplication {

    static final int PORT = 8080;


    public static void main(String[] args) {
        System.out.println("Start --- we are here!!");

        setupJbossEchoServer();
//        setupNettyFourEchoServer();
//        setupSimpleWebsocketEchoServer();
    }

    public static void setupJbossEchoServer() {
        ServerBootstrap bootstrap = new ServerBootstrap(
                new NioServerSocketChannelFactory(
                        Executors.newCachedThreadPool(),
                        Executors.newCachedThreadPool()));

        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {

            public ChannelPipeline getPipeline() throws Exception {
                return Channels.pipeline(new JBossEchoServerHandler());
            }

        });
        bootstrap.bind(new InetSocketAddress(PORT));
    }

    public static void setupNettyFourEchoServer() {
//        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
//        EventLoopGroup workerGroup = new NioEventLoopGroup();
//        try {
//            ServerBootstrap b = new ServerBootstrap();
//            b.group(bossGroup, workerGroup)
//                    .channel(NioServerSocketChannel.class)
//                    .handler(new LoggingHandler(LogLevel.INFO))
//                    .childHandler(new ChannelInitializer<SocketChannel>() {
//                        @Override
//                        public void initChannel(SocketChannel ch) {
//                            ChannelPipeline p = ch.pipeline();
//                            p.addLast(new TimeClientHandler());
//                        }
//                    });
//            ChannelFuture f = b.bind(PORT).sync();
//            System.out.println("Bound to PORT " + PORT);
//
//            f.channel().closeFuture().sync();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            System.err.println(e.toString());
//        } finally {
//            workerGroup.shutdownGracefully();
//            bossGroup.shutdownGracefully();
//        }
    }

    public static void setupSimpleWebsocketEchoServer() {
        //        Regular Websocket Echo Server
//        ServerSocket serverSocket = null;
//
//
//        try {
//            serverSocket = new ServerSocket(8080);
//        } catch (IOException e) {
//            System.err.println("Could not listen on port: " + 8080);
//            System.exit(1);
//        }
//
//        Socket clientSocket = null;
//        System.out.println("Waiting for connection.....");
//
//        try {
//            clientSocket = serverSocket.accept();
//        } catch (IOException e) {
//            System.err.println("Accept failed.");
//            System.exit(1);
//        }
//
//        System.out.println("Connection successful");
//        System.out.println("Waiting for input.....");
//
//        PrintWriter out = null;
//        try {
//            out = new PrintWriter(clientSocket.getOutputStream(),
//                    true);
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(clientSocket.getInputStream()));
//
//            String inputLine;
//
//            while ((inputLine = in.readLine()) != null) {
//                System.out.println("Server: " + inputLine);
//                out.println(inputLine);
//
//                if (inputLine.equals("Bye."))
//                    break;
//            }
//
//            out.close();
//            in.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            clientSocket.close();
//            serverSocket.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}