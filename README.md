# Spring code working with init and destory bean methods. 

## Singleton scoped beans can use the bean xml attr "destory-method", but in case of prototype scoped beans the bean has to implement DisposableBean and a custom bean processor needs to be implemented.