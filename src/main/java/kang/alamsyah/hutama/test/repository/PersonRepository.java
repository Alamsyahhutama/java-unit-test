package kang.alamsyah.hutama.test.repository;

import kang.alamsyah.hutama.test.data.Person;

public interface PersonRepository {

    Person selectById(String id);
    void insert(Person person);

}
