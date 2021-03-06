
## 建造者模式
- 使用多个简单的对象一步一步构建成一个复杂的对象。

- 主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。

- 注意
> 外层对象（例如demo中的Person和User）是不可变的，因此是线程安全的；但是，Builder对象并不具有线程安全性。

> 链式方法赋值，一定要用构建器模式吗？  
答案是：no。之所以使用构建器模式，是因为我们要创造的对象是一个成员变量不可变的对象。

## 使用场景
- lombok的@Builder注解的使用场景。
