/*
 * Copyright (c) 2013 Ronald D. Kurr kurr@kurron.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.kurron.root

import groovy.transform.TupleConstructor
import org.springframework.beans.factory.annotation.Value
import org.springframework.hateoas.Identifiable

/**
 * Model of the runtime environment.
 */
@TupleConstructor
class Environment {

    @Value('${cloud.application.name}')
    String applicationName

    @Value('${cloud.provider.url}')
    String providerURL

    @Value('${cloud.services.mongodb.connection.db}')
    String mongoConnectionDB

    @Value('${cloud.services.mongodb.connection.host}')
    String mongoConnectionHost

    @Value('${cloud.services.mongodb.connection.hostname}')
    String mongoConnectionHostname

    @Value('${cloud.services.mongodb.connection.name}')
    String mongoConnectionName

    @Value('${cloud.services.mongodb.connection.password}')
    String mongoConnectionPassword

    @Value('${cloud.services.mongodb.connection.port}')
    String mongoConnectionPort

    @Value('${cloud.services.mongodb.connection.username}')
    String mongoConnectionUsername

    @Value('${cloud.services.mongodb.plan}')
    String mongoPlan

    @Value('${cloud.services.mongodb.type}')
    String mongoType
}
