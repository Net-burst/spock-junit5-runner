import org.spockframework.runtime.extension.AbstractGlobalExtension
import org.spockframework.runtime.model.SpecInfo

class SpockExtension extends AbstractGlobalExtension {

    @Override
    void start() {
        println "Spock extension start"
    }

    @Override
    void visitSpec(SpecInfo spec) {
        println "Spock extension start visitSpec $spec.name"
    }

    @Override
    void stop() {
        println "Spock extension stop"
    }
}
