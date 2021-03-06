package com.yong.service.repository;

import com.yong.model.Mark;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 * @acthor yong.a.liang
 * @date 2017/11/14
 */
@Repository
public interface MarkRepository extends ReactiveMongoRepository<Mark,String>, MarkRepositoryCustom  {
    Flux<Mark> findAll(Sort sort);
}
