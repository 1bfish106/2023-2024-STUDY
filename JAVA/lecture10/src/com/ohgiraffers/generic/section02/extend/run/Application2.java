package com.ohgiraffers.generic.section02.extend.run;

import com.ohgiraffers.generic.section02.extend.Bunny;
import com.ohgiraffers.generic.section02.extend.DrunkenBunny;
import com.ohgiraffers.generic.section02.extend.Rabbit;
import com.ohgiraffers.generic.section02.extend.RabbitFarm;

public class Application2 {
    public static void main(String[] args) {
        //와일드 카드
        //제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을때
        //그 객체의 타입변수를 제한할수있다.

        WildFarm wildFarm = new WildFarm();

        //1. 매개변수 타입의 제한이 없는것
        //어떤 토끼를 가진 토끼농장이던 인자로 전달이 가능하다.
        wildFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        //2. 매개변수의 타입이 바니이거나 바니후손 토끼를 가진 토끼
        //wildFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        //3. 매개변수의 타입이 바니이거나 바니 상위 타입의 토끼를 가진 토끼농장만 인자로 전달가능
        wildFarm.superType((new RabbitFarm<>(new Rabbit())));
        wildFarm.superType((new RabbitFarm<>(new Bunny())));
        //매개변수가 다형성을 가지면서 정확히 전달되면 <> 에 같은 매개변수를 넣어야한다.
        //wildFarm.superType((new RabbitFarm<DrunkenBunny>(new DrunkenBunny())));
    }
}
