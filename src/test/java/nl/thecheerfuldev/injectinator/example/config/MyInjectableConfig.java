/*
 * Copyright 2018 Mark Hendriks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.thecheerfuldev.injectinator.example.config;

import nl.thecheerfuldev.injectinator.example.logger.AnotherLogger;
import nl.thecheerfuldev.injectinator.example.logger.DefaultLogger;
import nl.thecheerfuldev.injectinator.example.logger.ExtraLogger;
import nl.thecheerfuldev.injectinator.example.logger.Logger;
import nl.thecheerfuldev.injectinator.framework.module.AbstractConfigModule;

public class MyInjectableConfig extends AbstractConfigModule {

    @Override
    public void configure() {
        enableInjectable(Logger.class, DefaultLogger.class);
        enableInjectable(AnotherLogger.class, ExtraLogger.class);
    }
}
