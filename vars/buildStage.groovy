import com.example.jsl.Build

def call() {
    def buildStage = env.BUILD_STAGE ?: 'dev'
    def build = new Build()
    build.build(buildStage)
}