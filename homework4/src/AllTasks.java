public class AllTasks {
        public static void main(String[] args) {
            //task 1
            String a = "Favorite";
            String b = "Book";
            String a1 = a.toUpperCase();
            String b1 = b.toUpperCase();
            System.out.println(a1 + " " + b1);

            //task2
            StringBuilder str = new StringBuilder("Hello");
            str.deleteCharAt(1);
            str.deleteCharAt(3);
            System.out.println(str);

            //task 3
            StringBuilder s = new StringBuilder("hello");
            s.reverse();
            System.out.println(s);


        }

    }
    
