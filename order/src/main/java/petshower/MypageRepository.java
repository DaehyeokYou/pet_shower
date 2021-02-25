package petshower;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MypageRepository extends CrudRepository<Mypage, Long> {

	//수정 
    List<Mypage> findByOrderId(Long orderId);

}