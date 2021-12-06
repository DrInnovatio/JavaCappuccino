package unit_18;

class Inner3 {
    public void aaa(){
        System.out.println("AAA");
    }

    public void bbb(){
        System.out.println("BBB");
    }

    public void ccc(){
        System.out.println("CCC");
    }
}

public class Exam_05 {

    public static void main(String[] args) {
        final int x = 100;
        Inner3 inner = new Inner3(){
            @Override
            public void bbb() {
                System.out.println(x);
                System.out.println("Banana");
                fff();
            }

            public void fff(){
                System.out.println("Feather");
            }
        };
        inner.aaa();
        inner.bbb();
        inner.ccc();
    }
}
