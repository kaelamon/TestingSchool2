package Lesson8.Homework5;

class Test1 {
    static void mountain() {
        System.out.println("Как дела?");
    }
    static Test1 favorite(){
        System.out.print("Привет! ");
        return null;
    }
    public static void main(String[] args) {
        favorite().mountain();
    }
}
//сделал