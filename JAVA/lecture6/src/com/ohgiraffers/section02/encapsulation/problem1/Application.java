package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        //필드에 직접 접근하는 경우 발생할수있는 문제점을 이해한다.
        Monster monster1 = new Monster();
        monster1.name = "두치";
        monster1.hp = 200;
        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "뿌꾸";
        monster2.hp = -200;
        System.out.println("monster1 name : " + monster2.name);
        System.out.println("monster1 hp : " + monster2.hp);

        //hp는 음수일수가없다. 이게 직접접근의 문제

        Monster monster3 = new Monster();

        monster3.name = "프랑켄슈타인";
        monster3.setHp(-300);

        System.out.println("monster1 name : " + monster3.name);
        System.out.println("monster1 hp : " + monster3.hp);

    }
}
