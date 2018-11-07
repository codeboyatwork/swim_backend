package com.swim.arn.serial;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerialRepository extends CrudRepository<Serial, Integer> {

}
