package com.lk.hellospringboot.dao;

import com.lk.hellospringboot.model.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author likun
 * @version V1.0
 * @Title: com.lk.hellospringboot.dao
 * @date 2018/4/13 16:29
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    Girl findByName(String name);

//    @Override
//    Girl save(Girl girl);
}
