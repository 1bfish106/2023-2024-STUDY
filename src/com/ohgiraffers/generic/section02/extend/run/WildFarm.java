package com.ohgiraffers.generic.section02.extend.run;

import com.ohgiraffers.generic.section02.extend.Bunny;
import com.ohgiraffers.generic.section02.extend.RabbitFarm;

public class WildFarm {
    //매개변수로 전달받는 토끼 농장을 구현할때 사용할 타입변수 제한
    //와일드카드는 ? 문자를 의미
    //메소드의 매개변수로만 씀

    //그냥 ?만 있으면 거기에 있는 토끼든 어떤 토끼든 상관이 없다
    //래빗팜에 있는 모든 래빗다 된다는 뜻인듯
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }
    //이건 버니랑 버니를 상속하는 드렁큰 버니만 된다는 뜻
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    //버니타입이거나 버니의 부모타입일때만 된다는 뜻
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
