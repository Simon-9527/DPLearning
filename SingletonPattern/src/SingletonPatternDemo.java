public class SingletonPatternDemo {

    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObjectLazy() 是不可见的
//        SingleObjectLazy object = new SingleObjectLazy();

        //1-懒汉式，线程不安全
        //获得唯一可用的对象
        SingleObjectLazy object1 = SingleObjectLazy.getInstance();
        //显示消息
        object1.showMessage();

        //2-懒汉式，线程安全
        SingleObjectLazySafe object2 = SingleObjectLazySafe.getInstance();
        object2.showMessage();

        //3-饿汉式
        SingleObjectHungry object3 = SingleObjectHungry.getInstance();
        object3.showMessage();

        //4-双重校验锁（DCL，double-checked locking）
        SingleObjectDCL object4 = SingleObjectDCL.getInstance();
        object4.showMessage();

        //5-登记式/静态内部类
        SingleObjectStatic object5 = SingleObjectStatic.getInstance();
        object5.showMessage();

        //6-枚举
        SingleObjectEnum object6 = SingleObjectEnum.INSTANCE;
        object6.showMessage();
    }
}
