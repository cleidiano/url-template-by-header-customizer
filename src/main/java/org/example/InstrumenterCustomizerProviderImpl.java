package org.example;

import com.google.auto.service.AutoService;
import io.opentelemetry.instrumentation.api.incubator.instrumenter.InstrumenterCustomizer;
import io.opentelemetry.instrumentation.api.incubator.instrumenter.InstrumenterCustomizerProvider;

@AutoService(InstrumenterCustomizerProvider.class)
public class InstrumenterCustomizerProviderImpl implements InstrumenterCustomizerProvider {
    static {
        System.out.printf("==========================> InstrumenterCustomizerProviderImpl loaded by %s \n ", InstrumenterCustomizerProviderImpl.class.getClassLoader());
    }

    @Override
    public void customize(InstrumenterCustomizer customizer) {
        System.out.println("==========================> InstrumenterCustomizerProviderImpl.customize called " + InstrumenterCustomizerProviderImpl.class.getClassLoader());
    }
}
