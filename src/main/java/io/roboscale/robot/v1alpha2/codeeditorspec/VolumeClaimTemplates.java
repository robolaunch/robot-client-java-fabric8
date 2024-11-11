package io.roboscale.robot.v1alpha2.codeeditorspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class VolumeClaimTemplates implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * May contain labels and annotations that will be copied into the PVC
     * when creating it. No other fields are allowed and will be rejected during
     * validation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("May contain labels and annotations that will be copied into the PVC\nwhen creating it. No other fields are allowed and will be rejected during\nvalidation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.volumeclaimtemplates.Metadata metadata;

    public io.roboscale.robot.v1alpha2.codeeditorspec.volumeclaimtemplates.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(io.roboscale.robot.v1alpha2.codeeditorspec.volumeclaimtemplates.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * The specification for the PersistentVolumeClaim. The entire content is
     * copied unchanged into the PVC that gets created from this
     * template. The same fields as in a PersistentVolumeClaim
     * are also valid here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The specification for the PersistentVolumeClaim. The entire content is\ncopied unchanged into the PVC that gets created from this\ntemplate. The same fields as in a PersistentVolumeClaim\nare also valid here.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.volumeclaimtemplates.Spec spec;

    public io.roboscale.robot.v1alpha2.codeeditorspec.volumeclaimtemplates.Spec getSpec() {
        return spec;
    }

    public void setSpec(io.roboscale.robot.v1alpha2.codeeditorspec.volumeclaimtemplates.Spec spec) {
        this.spec = spec;
    }
}

