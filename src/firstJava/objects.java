package firstJava;

public class objects {

    class  car {
        int car;
        String name;
        int tank;

        public car(int car, String name, int tank) {
            this.car = car;
            this.name = name;
            this.tank = tank;
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    }






}
