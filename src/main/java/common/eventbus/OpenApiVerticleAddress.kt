package common.eventbus

class OpenApiVerticleAddress {
    companion object {
        val topicsAggregator: String = "openapi.fetch.topic"
        val questionDispatcher: String = "openapi.dispatch.question"
    }
}