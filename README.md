Java DBG
========

Java debugging expirements and example programs.

Hidden Gems
-----------

`onjcmd`:

```
 java "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=*:5005,onjcmd=y" src/test/java/OnThrowAndJCmd.java &
 echo $! # get pid
 # wait some time and then start debugging on demand
 jcmd $! VM.start_java_debugging
```

`onthrow` (place breakpoint in catch block):

```
 java "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=*:5005,launch=echo,onthrow=Ex" src/test/java/OnThrowAndJCmd.java
```

same with `oncaught`, but can only be used with `jdb` and is therefore limited.

License
-------
MIT License