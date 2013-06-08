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

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.hateoas.EntityLinks
import org.springframework.hateoas.LinkDiscoverer
import org.springframework.hateoas.RelProvider
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*

/**
 * The root of the HATEAOS discovery system.
 */
@Controller
@RequestMapping( value = ['/'], produces = ['application/json'])
class RootController {

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    DiscoverableResources listResources() {
        DiscoverableResources resource = new DiscoverableResources()
        resource.add( linkTo( EnvironmentController.class ).withRel( 'environment' ) )
        resource
    }
}
