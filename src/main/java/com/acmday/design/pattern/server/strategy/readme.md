## 策略模式

## 使用场景
     
## 故事背景
- 某个市场人员接到单儿后的报价策略，保价策略很复杂，但是可以简单做如下归类：  
 新客户小批量报价  
 新客户大批量报价  
 老客户小批量报价  
 老客户大批量报价  

- 根据不同的场景使用不同的报价策略，这时候采用策略模式即可解决这个问题。如果不用策略模式，很可能是
 下面的实现方式：
```java
 public double getPrice(String type, double price) {
     if(type.equals("新客户小批量")) {
        // 处理报价逻辑
        return price;
     } else if(type.equals("新客户大批量")) {
        // 处理报价逻辑
        return price;
     }
     //......
 }
```