package org.reactor.mapper.reactor;

import reactor.core.Environment;
import reactor.core.composable.Deferred;
import reactor.core.composable.Stream;
import reactor.core.composable.spec.DeferredStreamSpec;
import reactor.core.composable.spec.Streams;

/**
 * Created by ravi on 6/7/14.
 */
public class MainTest {
    public static void main(String[] args) {
        Environment env = new Environment();
        Deferred<OrderMapperContext, Stream<OrderMapperContext>> deferred = Streams.<OrderMapperContext>defer().env(env).get();
        Stream<OrderMapperContext> stream = deferred.compose();


    }
}
