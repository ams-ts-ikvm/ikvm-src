package com.sun.tools.jdeps.resources;

public final class jdkinternals extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "//", "No translation needed" },
            { "com.sun.crypto.provider.SunJCE", "Use java.security.Security.getProvider(provider-name) @since 1.3" },
            { "com.sun.image.codec", "Use javax.imageio @since 1.4" },
            { "com.sun.net.ssl", "Use javax.net.ssl @since 1.4" },
            { "com.sun.net.ssl.internal.ssl.Provider", "Use java.security.Security.getProvider(provider-name) @since 1.3" },
            { "com.sun.org.apache.xml.internal.security", "Use java.xml.crypto @since 1.6" },
            { "com.sun.org.apache.xml.internal.security.utils.Base64", "Use java.util.Base64 @since 1.8" },
            { "com.sun.rowset", "Use javax.sql.rowset.RowSetProvider @since 1.7" },
            { "com.sun.tools.javac", "Use javax.tools and javax.lang.model @since 1.6" },
            { "com.sun.tools.javac.tree", "Use com.sun.source @since 1.6" },
            { "sun.awt.image.codec", "Use javax.imageio @since 1.4" },
            { "sun.misc.BASE64Decoder", "Use java.util.Base64 @since 1.8" },
            { "sun.misc.BASE64Encoder", "Use java.util.Base64 @since 1.8" },
            { "sun.misc.Cleaner", "Use java.lang.ref.PhantomReference @since 1.2" },
            { "sun.misc.Service", "Use java.util.ServiceLoader @since 1.6" },
            { "sun.security.action", "Use java.security.PrivilegedAction @since 1.1" },
            { "sun.security.krb5", "Use com.sun.security.jgss" },
            { "sun.security.provider.PolicyFile", "Use java.security.Policy.getInstance(\"JavaPolicy\", new URIParameter(uri)) @since 1.6" },
            { "sun.security.provider.Sun", "Use java.security.Security.getProvider(provider-name) @since 1.3" },
            { "sun.security.util.SecurityConstants", "Use appropriate java.security.Permission subclass @since 1.1" },
            { "sun.security.x509.X500Name", "Use javax.security.auth.x500.X500Principal @since 1.4" },
            { "sun.tools.jar", "Use java.util.jar or jar tool @since 1.2" },
        };
    }
}
