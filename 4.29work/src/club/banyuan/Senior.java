package club.banyuan;

public class Senior extends Students{
    public Senior(String name) {
        super(name);
    }

    public void study() {
        System.out.println("高中生"+name+"正在学习");
    }
}
