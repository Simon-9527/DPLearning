public class SingleObjectStatic {

    //创建一个对象
    private static class SingleObjectHolder {
        private static final SingleObjectStatic INSTANCE = new SingleObjectStatic();
    }

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObjectStatic(){}

    //获得唯一可用的对象
    public static SingleObjectStatic getInstance(){

        return SingleObjectHolder.INSTANCE;
    }

    public void showMessage(){
        System.out.println("静态内部类：Hello World!");
    }
}
