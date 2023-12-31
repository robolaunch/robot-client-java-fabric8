package tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"scope","secretClass"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class BindCredentials implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * [Scope](https://docs.stackable.tech/home/nightly/secret-operator/scope) of the [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[Scope](https://docs.stackable.tech/home/nightly/secret-operator/scope) of the [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.bindcredentials.Scope scope;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.bindcredentials.Scope getScope() {
        return scope;
    }

    public void setScope(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.bindcredentials.Scope scope) {
        this.scope = scope;
    }

    /**
     * [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) containing the LDAP bind credentials.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretClass")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) containing the LDAP bind credentials.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secretClass;

    public String getSecretClass() {
        return secretClass;
    }

    public void setSecretClass(String secretClass) {
        this.secretClass = secretClass;
    }
}

