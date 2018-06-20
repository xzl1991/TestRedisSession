package DesignModel.decorateModel.decoratorReals;

import DesignModel.decorateModel.decorators.Decorator;
import DesignModel.decorateModel.interfaces.MyInterface;

/**
 * Created by ${xzl} on 2017/9/5.
 */
public class RealDecorate2 extends Decorator {
    public RealDecorate2(MyInterface myInterface) {
        super(myInterface);
    }
    public void beforeSay(){
        System.out.println("   装饰器--2,新增的方法....");
    }
    public void sayHello(){
        System.out.println();
        System.out.println("  装饰器--2,对原方法包装....");
        super.sayHello();
        System.out.println("  装饰器--2,自定义结束....");
    }
}













































