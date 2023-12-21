package com.cyl.chapter10.innerclass_;

public class Exercise02 {
    public static void main(String[] args) {
        new Cellphone().alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("qichaung");
            }
        });
        new Cellphone().alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("sjhagke");
            }
        });

    }

}
interface Bell {
    void ring();
}
class Cellphone {
   public void alarmClock(Bell bell) {
        bell.ring();
   }
}