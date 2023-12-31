package tech.stackable.authentication.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"provider"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AuthenticationClassSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Provider used for authentication like LDAP or Kerberos.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Provider used for authentication like LDAP or Kerberos.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.Provider provider;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.Provider getProvider() {
        return provider;
    }

    public void setProvider(tech.stackable.authentication.v1alpha1.authenticationclassspec.Provider provider) {
        this.provider = provider;
    }
}

