/*
 * Copyright (c) 2017 Sphereon B.V. <https://sphereon.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sphereon.libs.blockchain.spring;

import com.sphereon.libs.blockchain.commons.Digest;
import com.sphereon.libs.blockchain.commons.Operations;
import com.sphereon.libs.blockchain.commons.RegistrationTypeRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EasyBlockchainLibSpringConfiguration {

    @Bean
    public Operations operations() {
        return Operations.getInstance();
    }

    @Bean
    public Digest digest() {
        return Digest.getInstance();
    }

    @Bean
    public RegistrationTypeRegistry registrationTypeRegistry() {
        return RegistrationTypeRegistry.getInstance();
    }
}