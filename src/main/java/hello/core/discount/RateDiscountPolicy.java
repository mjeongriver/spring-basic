package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //FixDiscountPolicy도 component로 등록했다. 이름만 다르고 완전히 똑같은 타입의 스프링 빈이 2개 있을 땐 해결이 되지 않음.
//@Qualifier("mainDiscountPolicy")
@MainDiscountPolicy
//@Primary
public class RateDiscountPolicy implements DiscountPolicy {
    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;

        }
    }
}
