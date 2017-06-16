### Echo Server on CF

In this implimentation of an echo server we have code to test simple Websocket connections into cf, netty 3 and netty 4.
You should be able to comment in the different implementations in NettyApplication and in the pom file.

#####To Deploy:
Run: 
```
mvn clean install
cf push --no-route
cf map-route netty-dev YOUR_PLATFORM_TCP_ROUTE -p PORT 
```

Note: If you push this app again with the no-route flag, the app will become unbound from this route and you'll have to rebind it. 
