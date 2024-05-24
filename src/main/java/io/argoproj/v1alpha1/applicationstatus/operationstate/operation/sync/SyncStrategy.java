package io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"apply","hook"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SyncStrategy implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Apply will perform a `kubectl apply` to perform the sync.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apply")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Apply will perform a `kubectl apply` to perform the sync.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.syncstrategy.Apply apply;

    public io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.syncstrategy.Apply getApply() {
        return apply;
    }

    public void setApply(io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.syncstrategy.Apply apply) {
        this.apply = apply;
    }

    /**
     * Hook will submit any referenced resources to perform the sync. This is the default strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hook")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hook will submit any referenced resources to perform the sync. This is the default strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.syncstrategy.Hook hook;

    public io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.syncstrategy.Hook getHook() {
        return hook;
    }

    public void setHook(io.argoproj.v1alpha1.applicationstatus.operationstate.operation.sync.syncstrategy.Hook hook) {
        this.hook = hook;
    }
}

