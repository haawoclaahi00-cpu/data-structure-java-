public class Main9 {
        public static void main(String[] args) {

            try {

                throw new EmptyCollectionException("stack");

            } catch (EmptyCollectionException e) {

                System.out.println("Caught: " + e.getMessage());
            }
        }
    }

