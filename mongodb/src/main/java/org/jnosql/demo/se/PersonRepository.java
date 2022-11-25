/*
 * Copyright (c) 2017 Otávio Santana and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *
 * Otavio Santana
 */

package org.jnosql.demo.se;


import jakarta.nosql.mapping.Pagination;
import jakarta.nosql.mapping.Repository;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Stereotype;
import java.util.List;
import java.util.stream.Stream;


@ApplicationScoped
public interface PersonRepository extends Repository<Person, Long> {
    List<Person> findByName(String name);

    Stream<Person> findByPhones(String phone);
    List<Person> findAll(Pagination pagination);

}
