package org.example;

import com.google.auto.service.AutoService;
import io.opentelemetry.instrumentation.api.incubator.semconv.http.HttpClientUrlTemplateCustomizer;
import io.opentelemetry.instrumentation.api.semconv.http.HttpClientAttributesGetter;

import javax.annotation.Nullable;
import java.util.List;

@AutoService(HttpClientUrlTemplateCustomizer.class)
public class HttpHeaderUrlTemplateCustomizer implements HttpClientUrlTemplateCustomizer {
    static {
        System.out.printf("==========================> HttpHeaderUrlTemplateCustomizer LOADED by %s \n", HttpHeaderUrlTemplateCustomizer.class.getClassLoader());
    }

    @Nullable
    @Override
    public <REQUEST> String customize(@Nullable String urlTemplate, REQUEST request, HttpClientAttributesGetter<REQUEST, ?> getter) {
        System.out.printf("Init - HttpHeaderUrlTemplateCustomizer.customize >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> %s\n", urlTemplate);
        List<String> headerTemplate = getter.getHttpRequestHeader(request, "url-template");
        System.out.printf("End - HttpHeaderUrlTemplateCustomizer.customized >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> %s", headerTemplate);
        return null;
    }
}