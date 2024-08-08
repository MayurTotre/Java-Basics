package java_basics4;

public class Collections {


        enum Week{
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

//             Week() {
//                System.out.println(this);
//            }
        }

        public static void main(String[] args) {
            Week week = Week.Monday;
//            for (Week day : Week.values()){
//                System.out.println(day);
//            }
            System.out.println(week);

        }
    }

