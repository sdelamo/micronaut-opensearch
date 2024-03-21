/*
 * Copyright 2017-2024 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.opensearch.httpclient5.converters;

import io.micronaut.core.annotation.Internal;
import io.micronaut.core.convert.ConversionContext;
import io.micronaut.core.convert.TypeConverter;
import org.apache.hc.core5.http.HttpHost;

import java.net.URI;
import java.util.Optional;

/**
 * Converter for CharSequence to HTTP host.
 */
@Internal
final class StringToHttpHostConverter implements TypeConverter<CharSequence, HttpHost> {

    @Override
    public Optional<HttpHost> convert(CharSequence object, Class<HttpHost> targetType, ConversionContext context) {
        String uriString = object.toString();
        URI uri = URI.create(uriString);
        return Optional.of(new HttpHost(uri.getScheme(), uri.getHost(), uri.getPort()));
    }
}
