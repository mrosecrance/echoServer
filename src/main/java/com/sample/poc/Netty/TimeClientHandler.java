package com.sample.poc.Netty;

//import io.netty.channel.ChannelHandlerContext;
//import io.netty.channel.ChannelInboundHandlerAdapter;
//
///**
// * Created by fbdrxjn on 6/9/17.
// */
//
//
//public class TimeClientHandler extends ChannelInboundHandlerAdapter {
//
//    @Override
//    public void channelRead(ChannelHandlerContext ctx, Object msg) {
//        System.out.println("Got a message!");
//        ctx.write(msg);
//    }
//
//    @Override
//    public void channelReadComplete(ChannelHandlerContext ctx) {
//        ctx.flush();
//    }
//
//    @Override
//    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
//        // Close the connection when an exception is raised.
//        cause.printStackTrace();
//        ctx.close();
//    }
//}