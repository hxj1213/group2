package an2;

public class text {
    public static void main(String[] args) {
        System.out.println("an is pig");

    }

    public class id{
             private int i;
             private String neme;
             private String max;

        public id(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        @Override
        public String toString() {
            return "id{" +
                    "i=" + i +
                    ", neme='" + neme + '\'' +
                    ", max='" + max + '\'' +
                    '}';
        }
    }
}
