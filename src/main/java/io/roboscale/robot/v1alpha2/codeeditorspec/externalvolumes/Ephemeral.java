package io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"volumeClaimTemplate"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Ephemeral implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Will be used to create a stand-alone PVC to provision the volume.
     * The pod in which this EphemeralVolumeSource is embedded will be the
     * owner of the PVC, i.e. the PVC will be deleted together with the
     * pod.  The name of the PVC will be `<pod name>-<volume name>` where
     * `<volume name>` is the name from the `PodSpec.Volumes` array
     * entry. Pod validation will reject the pod if the concatenated name
     * is not valid for a PVC (for example, too long).
     *
     * An existing PVC with that name that is not owned by the pod
     * will *not* be used for the pod to avoid using an unrelated
     * volume by mistake. Starting the pod is then blocked until
     * the unrelated PVC is removed. If such a pre-created PVC is
     * meant to be used by the pod, the PVC has to updated with an
     * owner reference to the pod once the pod exists. Normally
     * this should not be necessary, but it may be useful when
     * manually reconstructing a broken cluster.
     *
     * This field is read-only and no changes will be made by Kubernetes
     * to the PVC after it has been created.
     *
     * Required, must not be nil.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeClaimTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Will be used to create a stand-alone PVC to provision the volume.\nThe pod in which this EphemeralVolumeSource is embedded will be the\nowner of the PVC, i.e. the PVC will be deleted together with the\npod.  The name of the PVC will be `<pod name>-<volume name>` where\n`<volume name>` is the name from the `PodSpec.Volumes` array\nentry. Pod validation will reject the pod if the concatenated name\nis not valid for a PVC (for example, too long).\n\n\nAn existing PVC with that name that is not owned by the pod\nwill *not* be used for the pod to avoid using an unrelated\nvolume by mistake. Starting the pod is then blocked until\nthe unrelated PVC is removed. If such a pre-created PVC is\nmeant to be used by the pod, the PVC has to updated with an\nowner reference to the pod once the pod exists. Normally\nthis should not be necessary, but it may be useful when\nmanually reconstructing a broken cluster.\n\n\nThis field is read-only and no changes will be made by Kubernetes\nto the PVC after it has been created.\n\n\nRequired, must not be nil.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.ephemeral.VolumeClaimTemplate volumeClaimTemplate;

    public io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.ephemeral.VolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(io.roboscale.robot.v1alpha2.codeeditorspec.externalvolumes.ephemeral.VolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }
}

