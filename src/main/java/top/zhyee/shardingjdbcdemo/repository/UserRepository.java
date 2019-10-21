package top.zhyee.shardingjdbcdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import top.zhyee.shardingjdbcdemo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
