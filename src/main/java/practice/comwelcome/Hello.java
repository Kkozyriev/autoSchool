package practice.comwelcome;

    public class Hello {
        private static String userName;

        public Hello() {
        }

        public static void main(String[] var0) {
        }

        public static void setupName(String var0) {
            userName = var0;
        }

        public static void welcome() {
            System.out.println("Hello," + userName + "!");
        }

        public static void byeBay() {
            System.out.println("Bye, " + userName + "!");
        }
    }

