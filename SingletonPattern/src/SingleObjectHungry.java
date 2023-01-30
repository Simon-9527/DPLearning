public class SingleObjectHungry {

    //创建一个对象
    private static SingleObjectHungry instance = new SingleObjectHungry();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObjectHungry(){}

    //获得唯一可用的对象
    public static SingleObjectHungry getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("饿汉式：Hello World!");
    }
}
