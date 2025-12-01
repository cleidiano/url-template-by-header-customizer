 java \
    -Dotel.traces.exporter=none \
    -Dotel.metrics.exporter=console \
    -Dotel.logs.exporter=none \
    -Dotel.instrumentation.http.client.emit-experimental-telemetry=true \
    -Dotel.javaagent.extensions=build/libs/url-template-by-header-customizer-1.0-SNAPSHOT.jar \
    -javaagent:opentelemetry-javaagent-2.22.0.jar \
    -jar build/libs/url-template-by-header-customizer-1.0-SNAPSHOT.jar