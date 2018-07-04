package kevin.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceImpl implements ScheduleService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry: " + name + "进到我这里了！";
    }
}
