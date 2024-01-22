public class AwesomeJavaProgram {
        public static void main(String[] args) {

          for (int i = 0; i < 10; i++) {
              System.out.println("These pretzels are making me thirsty");
          }
        }
        private static String printName(String name, int number) {

            if (number != 5) {
                System.out.println("This guy is awesome");
            }

            else if (name.equals("Larry")) {
                System.out.println("This guy is OK I guess");
            }

            else { System.out.println("I don't know this guy at all");
            }


            return "My name is " + name;
        }
    }
