package top.zhyee.shardingjdbcdemo.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.zhyee.shardingjdbcdemo.entity.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void add() {
        userRepository.save(User.builder()
                .passwordLogic("passwordLogic")
                .id(3)
                .name("name")
                .build());
    }

    @Test
    public void get(){
        System.out.println(userRepository.findOne(3));
    }

}