package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //지정을 안하면 해당 AutoAppConfig 클래스가 속한 패키지가 시작 위치가 된다.
        basePackages = "hello.core", //탐색할 패키지의 시작 위치를 지정한다. 이 패키지를 포함해서 하위 패키지를 모두 탐색한다.
        basePackageClasses = AutoAppConfig.class, //지정한 클래스의 패키지를 탐색 시작 위치로 지정한다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) //Configuration을 제외하기 위한 설정
)
public class AutoAppConfig {

}
