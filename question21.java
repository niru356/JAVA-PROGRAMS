class puter {
    void display() {
        class Inner {
            void show() {
                System.out.println("This is an inner class");
            }
        }

        Inner i = new Inner();
        i.show();
    }

    public static void main(String[] args) {
        puter o = new puter();
        o.display();
    }
}