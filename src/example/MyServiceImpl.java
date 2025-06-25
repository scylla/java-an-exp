package example;

import org.springframework.stereotype.Service;
@Service
public class MyServiceImpl implements MyService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String process(String input) {
        return input;
    }

    @Override
    public boolean isTransformEnabled() {
        return true;
    }
}
