package java_basics6;

public class StudMarks implements  Comparable<StudMarks>{
    private int maths;
    private int physics;

    @Override
    public String toString() {
        return "StudMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    public StudMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public static void main(String[] args) {

    }


    @Override
    public int compareTo(StudMarks o) {
//        if (this.maths < o.maths) {
//            return -1;
//        }
//        if(this.maths>o.maths){
//            return 1;
//        }
//        if(this.maths == o.maths){
//            return 0;
//        }
        return this.maths - o.maths;
    }
}
