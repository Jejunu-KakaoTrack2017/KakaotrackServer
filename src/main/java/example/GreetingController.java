package example;

/**
 * Created by replay on 2017. 2. 14..
 */

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static jdk.nashorn.internal.runtime.PropertyDescriptor.GET;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

//    Note: 위의 예제에서는 @RequestMapping이 모든 HTTP 동작에 기본으로 작동하도록  GET, PUT, POST 등을 지정하지 않았습니다.
//    @RequestMapping(method=GET) 을 사용하면 mapping을 구체화 할 수 있습니다.

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}