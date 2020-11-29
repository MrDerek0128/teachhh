package teach.repository;

import org.springframework.stereotype.Repository;
import teach.entity.User;

@Repository
public interface MyRepository {
    void insert(String username,String password);
}
