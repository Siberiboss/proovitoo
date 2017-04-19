package com.example.jersey;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Jonas on 4/17/2017.
 */

@Transactional
@Repository
public interface IDataDao extends CrudRepository<Data, Integer> {
    @Query("select data from Data d where d.data like %:search%")
    List<Data> findDataByString(@Param("search") String search);
    List<Data> findAll();
}
